package com.example.a01.foregroundservice.Services;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.IBinder;
import android.support.v4.app.NotificationCompat;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.a01.foregroundservice.MainActivity;
import com.example.a01.foregroundservice.R;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.SettingsClient;

public class MyLocationService extends BroadcastReceiver {


//    private NotificationManager mNotificationManager;
//    private NotificationCompat.Builder mBuilder;
//    public static final String NOTIFICATION_CHANNEL_ID = "myServiceID";
public static final String ACTION_PROCESS_UPDATE = "UPDATE_LOCATION";


    @Override
    public void onReceive(Context context, Intent intent) {
//        if (intent != null){
//            final String action = intent.getAction();
//            if (ACTION_PROCESS_UPDATE.equals(action)){
//                LocationResult result = LocationResult.extractResult(intent);
//                if (result != null){
//                    Location location = result.getLastLocation();
//                    String location_string = new StringBuilder("" + location.getLongitude())
//                            .append("\n")
//                            .append(location.getLatitude())
//                            .toString();
//                    try {
//                        MainActivity.getInstance().updateTextView(location_string);
//                        Toast.makeText(context, location_string, Toast.LENGTH_SHORT).show();
//                        //noticationHelper(context,"Location" + "\n" + location_string);
//                    }catch (Exception e){
//                        Toast.makeText(context, location_string, Toast.LENGTH_SHORT).show();
//                    }
//                }
//            }
//        }
    }
//    public void noticationHelper(Context context,String message){
//        Intent notificationIntent = new Intent(context, MainActivity.class);
//        PendingIntent pendingIntent = PendingIntent.getActivity(context,
//                0, notificationIntent, 0);
//        mBuilder = new NotificationCompat.Builder(context);
//        mBuilder.setContentTitle("My_notification");
//        mBuilder.setContentText(message);
//        mBuilder.setSmallIcon(R.drawable.ic_launcher_background);
//        mBuilder.setContentIntent(pendingIntent);
//        mBuilder.build();
//
//        mNotificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
//
//        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
//            int importance = NotificationManager.IMPORTANCE_HIGH;
//            NotificationChannel notificationChannel = new NotificationChannel(NOTIFICATION_CHANNEL_ID, "NOTIFICATION_CHANNEL_NAME", importance);
//            assert mNotificationManager != null;
//            mBuilder.setChannelId(NOTIFICATION_CHANNEL_ID);
//            mNotificationManager.createNotificationChannel(notificationChannel);
//        }
//        assert mNotificationManager != null;
//        mNotificationManager.notify(1, mBuilder.build());
//    }
}
