package com.example.appjava;

import android.app.Activity;

import java.util.ArrayList;

public class Collection {
    public static ArrayList<Activity> activityArrayList = new ArrayList<>();

    public static void addActivity(Activity activity) {
        activityArrayList.add(activity);
    }

    public static void removeActivity(Activity activity){
        activityArrayList.remove(activity);
    }

    public static void finishActivity(){
        for(Activity activity : activityArrayList){
            if (!activity.isFinishing()){
                activity.finish();
            }
            else {
                System.out.println("activity is finishing.");
            }
        }
    }
}
