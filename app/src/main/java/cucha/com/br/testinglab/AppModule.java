package cucha.com.br.testinglab;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Locale;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Scheduler;
import rx.android.schedulers.AndroidSchedulers;
import rx.plugins.RxJavaObservableExecutionHook;
import rx.schedulers.Schedulers;

public class AppModule {

    static String baseUrl = "http://api.sky.com";
    static OkHttpClient okHttpClient;

    public static FilmesAPI getFilmesAPI() {

        OkHttpClient okHttpClient = getOkHttpClient();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(okHttpClient)
                .build();

        return retrofit.create(FilmesAPI.class);
    }

    public static void setBaseUrl(String baseUrl) {
        AppModule.baseUrl = baseUrl;
    }

    public static String getBaseUrl() {
        return baseUrl;
    }

    public static OkHttpClient getOkHttpClient() {
        if(okHttpClient == null) {
            HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
            loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

            OkHttpClient.Builder client = new OkHttpClient.Builder();
            client.addInterceptor(loggingInterceptor);
            okHttpClient = client.build();
        }

        return okHttpClient;
    }

    public static Scheduler getUIScheduler() {
        return AndroidSchedulers.mainThread();
    }

    public static Scheduler getIOScheduler() {
        return Schedulers.io();
    }

    public static Scheduler getFakeIOScheduler() {
        return Schedulers.computation();
    }

    public static Gson getGson() {
        return new GsonBuilder().create();
    }

    public static Locale getLocale() {
        return Locale.getDefault();
    }
}
