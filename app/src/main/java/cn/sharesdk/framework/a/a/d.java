package cn.sharesdk.framework.a.a;

import android.content.ContentValues;
import android.database.Cursor;
import cn.sharesdk.framework.utils.SSDKLog;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class d {
    public static synchronized long a(String str, long j10) {
        synchronized (d.class) {
            if (str != null) {
                if (str.trim() != "") {
                    b a10 = b.a();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("post_time", Long.valueOf(j10));
                    contentValues.put("message_data", str);
                    return a10.a(CrashHianalyticsData.MESSAGE, contentValues);
                }
            }
            return -1L;
        }
    }

    public static synchronized long a(ArrayList<String> arrayList) {
        long j10;
        synchronized (d.class) {
            if (arrayList == null) {
                j10 = 0;
            } else {
                StringBuilder sb2 = new StringBuilder();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    sb2.append("'");
                    sb2.append(arrayList.get(i10));
                    sb2.append("'");
                    sb2.append(",");
                }
                String substring = sb2.toString().substring(0, sb2.length() - 1);
                int a10 = b.a().a(CrashHianalyticsData.MESSAGE, "_id in ( " + substring + " )", null);
                SSDKLog.b().c("delete COUNT == %s", Integer.valueOf(a10));
                j10 = a10;
            }
        }
        return j10;
    }

    public static synchronized ArrayList<c> a() {
        synchronized (d.class) {
            if (b.a().a(CrashHianalyticsData.MESSAGE) > 0) {
                return a((String) null, (String[]) null);
            }
            return new ArrayList<>();
        }
    }

    private static synchronized ArrayList<c> a(String str, String[] strArr) {
        ArrayList<c> arrayList;
        synchronized (d.class) {
            arrayList = new ArrayList<>();
            c cVar = new c();
            StringBuilder sb2 = new StringBuilder();
            Cursor a10 = b.a().a(CrashHianalyticsData.MESSAGE, new String[]{"_id", "post_time", "message_data"}, str, strArr, null);
            while (a10 != null && a10.moveToNext()) {
                cVar.f5109b.add(a10.getString(0));
                if (cVar.f5109b.size() == 100) {
                    sb2.append(a10.getString(2));
                    cVar.f5108a = sb2.toString();
                    arrayList.add(cVar);
                    cVar = new c();
                    sb2 = new StringBuilder();
                } else {
                    sb2.append(a10.getString(2) + "\n");
                }
            }
            a10.close();
            if (cVar.f5109b.size() != 0) {
                cVar.f5108a = sb2.toString().substring(0, sb2.length() - 1);
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }
}
