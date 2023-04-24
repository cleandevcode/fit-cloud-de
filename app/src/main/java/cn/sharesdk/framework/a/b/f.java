package cn.sharesdk.framework.a.b;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Base64;
import cn.sharesdk.framework.InnerShareParams;
import cn.sharesdk.framework.utils.SSDKLog;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.Hashon;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public class f extends c {

    /* renamed from: o */
    private static int f5141o;

    /* renamed from: p */
    private static long f5142p;

    /* renamed from: a */
    public int f5143a;

    /* renamed from: b */
    public String f5144b;

    /* renamed from: c */
    public String f5145c;

    /* renamed from: d */
    public a f5146d = new a();

    /* renamed from: m */
    public String f5147m;

    /* renamed from: n */
    public String[] f5148n;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: b */
        public String f5150b;

        /* renamed from: g */
        public HashMap<String, Object> f5155g;

        /* renamed from: a */
        public String f5149a = "";

        /* renamed from: c */
        public ArrayList<String> f5151c = new ArrayList<>();

        /* renamed from: d */
        public ArrayList<String> f5152d = new ArrayList<>();

        /* renamed from: e */
        public ArrayList<String> f5153e = new ArrayList<>();

        /* renamed from: f */
        public ArrayList<Bitmap> f5154f = new ArrayList<>();

        public String toString() {
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(this.f5150b)) {
                String replaceAll = this.f5150b.trim().replaceAll("\r", "");
                this.f5150b = replaceAll;
                String replaceAll2 = replaceAll.trim().replaceAll("\n", "");
                this.f5150b = replaceAll2;
                this.f5150b = replaceAll2.trim().replaceAll("\r\n", "");
            }
            hashMap.put(InnerShareParams.TEXT, this.f5150b);
            hashMap.put(InnerShareParams.URL, this.f5151c);
            ArrayList<String> arrayList = this.f5152d;
            if (arrayList != null && arrayList.size() > 0) {
                hashMap.put("imgs", this.f5152d);
            }
            if (this.f5155g != null) {
                hashMap.put("attch", new Hashon().fromHashMap(this.f5155g));
            }
            return new Hashon().fromHashMap(hashMap);
        }
    }

    @Override // cn.sharesdk.framework.a.b.c
    public String a() {
        return "[SHR]";
    }

    @Override // cn.sharesdk.framework.a.b.c
    public void a(long j10) {
        f5142p = j10;
    }

    @Override // cn.sharesdk.framework.a.b.c
    public int b() {
        return 5000;
    }

    @Override // cn.sharesdk.framework.a.b.c
    public int c() {
        return 30;
    }

    @Override // cn.sharesdk.framework.a.b.c
    public long d() {
        return f5141o;
    }

    @Override // cn.sharesdk.framework.a.b.c
    public long e() {
        return f5142p;
    }

    @Override // cn.sharesdk.framework.a.b.c
    public void f() {
        f5141o++;
    }

    @Override // cn.sharesdk.framework.a.b.c
    public String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder(super.toString());
        sb2.append('|');
        sb2.append(this.f5143a);
        sb2.append('|');
        sb2.append(this.f5144b);
        sb2.append('|');
        if (TextUtils.isEmpty(this.f5145c)) {
            str = "";
        } else {
            str = this.f5145c;
        }
        sb2.append(str);
        String[] strArr = this.f5148n;
        if (strArr == null || strArr.length <= 0) {
            str2 = "";
        } else {
            str2 = androidx.activity.e.b(android.support.v4.media.d.a("[\""), TextUtils.join("\",\"", this.f5148n), "\"]");
        }
        sb2.append('|');
        sb2.append(str2);
        sb2.append('|');
        a aVar = this.f5146d;
        if (aVar != null) {
            try {
                String encodeToString = Base64.encodeToString(Data.AES128Encode(this.f5126f.substring(0, 16), aVar.toString()), 0);
                if (encodeToString.contains("\n")) {
                    encodeToString = encodeToString.replace("\n", "");
                }
                sb2.append(encodeToString);
            } catch (Throwable th2) {
                SSDKLog.b().a(th2);
            }
        }
        sb2.append('|');
        if (!TextUtils.isEmpty(this.f5132l)) {
            sb2.append(this.f5132l);
        }
        sb2.append('|');
        if (!TextUtils.isEmpty(this.f5147m)) {
            try {
                String encodeToString2 = Base64.encodeToString(Data.AES128Encode(this.f5126f.substring(0, 16), this.f5147m), 0);
                if (!TextUtils.isEmpty(encodeToString2) && encodeToString2.contains("\n")) {
                    encodeToString2 = encodeToString2.replace("\n", "");
                }
                sb2.append(encodeToString2);
            } catch (Throwable th3) {
                SSDKLog.b().b(th3);
            }
        }
        return sb2.toString();
    }
}
