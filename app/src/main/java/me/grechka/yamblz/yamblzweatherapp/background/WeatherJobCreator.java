package me.grechka.yamblz.yamblzweatherapp.background;

import android.support.annotation.NonNull;

import com.evernote.android.job.Job;
import com.evernote.android.job.JobCreator;

import javax.inject.Inject;
import javax.inject.Singleton;

import me.grechka.yamblz.yamblzweatherapp.data.DatabaseRepository;

/**
 * Created by Grechka on 14.07.2017.
 */

@Singleton
public class WeatherJobCreator implements JobCreator {

    private DatabaseRepository repository;

    @Inject
    public WeatherJobCreator(@NonNull DatabaseRepository repository) {
        this.repository = repository;
    }

    @Override
    public Job create(String tag) {
        switch (tag) {
            case CurrentWeatherUpdateJob.TAG:
                return new CurrentWeatherUpdateJob(repository);
            default:
                return null;
        }
    }
}
