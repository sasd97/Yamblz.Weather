package me.grechka.yamblz.yamblzweatherapp.data.net;

import io.reactivex.Single;
import me.grechka.yamblz.yamblzweatherapp.models.response.forecast.ForecastResponse;
import me.grechka.yamblz.yamblzweatherapp.models.response.weather.WeatherResponse;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Grechka on 14.07.2017.
 */

public interface WeatherApi {

    String API_KEY = "847aa9acae58b3e1ccd9da7ef3fc4d01";

    @GET("weather")
    Single<WeatherResponse> getWeatherByLocation(@Query("lat") double latitude,
                                                 @Query("lon") double lon,
                                                 @Query("appid") String apiKey);

    @GET("forecast/daily")
    Single<ForecastResponse> getForecastByLocation(@Query("lat") double latitude,
                                                   @Query("lon") double longitude,
                                                   @Query("cnt") int counter,
                                                   @Query("appid") String apiKey);
}
