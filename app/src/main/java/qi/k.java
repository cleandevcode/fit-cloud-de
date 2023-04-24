package qi;

import android.content.ComponentName;
import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import com.topstep.fitcloud.pro.function.MyNotificationListenerService;

/* loaded from: classes2.dex */
public final class k {
    public static boolean a(Context context) {
        String name = MyNotificationListenerService.class.getName();
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        for (String str : string.split(":", -1)) {
            ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
            if (unflattenFromString != null && TextUtils.equals("com.topstep.fitcloudpro", unflattenFromString.getPackageName()) && TextUtils.equals(name, unflattenFromString.getClassName())) {
                return true;
            }
        }
        return false;
    }
}
