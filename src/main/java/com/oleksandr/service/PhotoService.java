package com.oleksandr.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.oleksandr.model.Photo;
import com.oleksandr.model.PhotosCollection;
import com.oleksandr.utils.RestClient;

import java.io.IOException;
import java.util.*;

public class PhotoService {
    private RestClient restClient = new RestClient();
    private ObjectMapper objectMapper = new ObjectMapper();
    private String photosCollectionJson = restClient
            .RequestGet("https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?sol=1000&api_key=6V7a1Tl6C2QBdqLMhEHKg52EIS2L6faP89kKtgD9");
    private List<Photo> photosCollectionBySol = objectMapper.readValue(photosCollectionJson, PhotosCollection.class).getPhotos();

    public PhotoService() throws IOException {
    }

    public List<Photo> GetFirst10PhotosMadeOn1000SolBySol() throws IOException {
        List<Photo> photos = new ArrayList<Photo>();
        for (int i = 0; i < 10; i++) {
            photos.add(photosCollectionBySol.get(i));
        }
        return photos;
    }

    public List<Photo> GetFirst10PhotosMadeOn1000SolByEarthDate() throws IOException {
        String photosCollectionJson = restClient
                .RequestGet("https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?earth_date=2015-05-30&api_key=6V7a1Tl6C2QBdqLMhEHKg52EIS2L6faP89kKtgD9");

        List<Photo> photosCollection = objectMapper.readValue(photosCollectionJson, PhotosCollection.class).getPhotos();
        List<Photo> photos = new ArrayList<Photo>();
        for (int i = 0; i < 10; i++) {
            photos.add(photosCollection.get(i));
        }
        return photos;
    }

    public boolean SomeCameraTookTenTimesMorePicturesThanOther() throws IOException {
        Map<String, Integer> picturesNumberByCamera = new HashMap<String, Integer>();
        for (Photo photo : photosCollectionBySol) {
            if (!picturesNumberByCamera.containsKey(photo.getCamera().getName())) {
                picturesNumberByCamera.put(photo.getCamera().getName(), 1);
            } else {
                picturesNumberByCamera.put(photo.getCamera().getName(), picturesNumberByCamera.get(photo.getCamera().getName()) + 1);
            }
        }
        List<Integer> values = new ArrayList<Integer>(picturesNumberByCamera.values());
        Collections.sort(values);
        return values.get(values.size() - 1) > values.get(values.size() - 2) * 10;
    }
}
