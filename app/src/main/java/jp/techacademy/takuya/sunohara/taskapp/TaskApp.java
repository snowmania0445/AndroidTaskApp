package jp.techacademy.takuya.sunohara.taskapp;

import android.app.Application;

import io.realm.Realm;

public class TaskApp extends Application { //Applicationクラスを継承したTaskAppクラスを作成するだけではこのクラスは使われることはないため、AndroidManifest.xmlに１行追加する必要があります。
    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
    }
}
