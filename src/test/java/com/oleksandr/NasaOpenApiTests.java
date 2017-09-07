package com.oleksandr;

import com.oleksandr.service.PhotoService;
import org.junit.Test;

import java.io.IOException;

import static junit.framework.Assert.assertFalse;
import static junit.framework.TestCase.assertEquals;

public class NasaOpenApiTests {
    private PhotoService photoService = new PhotoService();

    public NasaOpenApiTests() throws IOException {
    }

    @Test
    public void CheckThatGetBySolAndGetByEarthDateResultsAreTheSame() throws IOException {
        assertEquals(photoService.GetFirst10PhotosMadeOn1000SolBySol(), photoService.GetFirst10PhotosMadeOn1000SolByEarthDate());
    }

    @Test
    public void CheckThatNoneOfCamerasTookTenTimesMorePicturesThanOther() throws IOException {
        assertFalse(photoService.SomeCameraTookTenTimesMorePicturesThanOther());
    }
}
