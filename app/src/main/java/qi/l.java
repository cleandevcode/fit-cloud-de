package qi;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class l {
    public static void a(Context context, NotificationManager notificationManager) {
        gm.l.f(context, "context");
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel("Core", context.getString(R.string.notification_channel_core_name), 4);
            notificationChannel.setDescription(context.getString(R.string.notification_channel_core_des));
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }

    public static void b(Context context, NotificationManager notificationManager) {
        gm.l.f(context, "context");
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel("Device", context.getString(R.string.device_module), 4);
            notificationChannel.setDescription(context.getString(R.string.notification_channel_device_des));
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }

    public static void c(Context context, NotificationManager notificationManager) {
        gm.l.f(context, "context");
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel("Sport", context.getString(R.string.module_sport), 4);
            notificationChannel.setDescription(context.getString(R.string.notification_channel_sport_des));
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }
}
