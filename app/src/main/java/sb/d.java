package sb;

import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    public Map<String, List<String>> f26831a;

    /* renamed from: b */
    public byte[] f26832b;

    /* renamed from: c */
    public int f26833c;

    /* renamed from: d */
    public long f26834d;

    /* renamed from: e */
    public long f26835e;

    /* renamed from: f */
    public long f26836f;

    /* renamed from: g */
    public String f26837g;

    /* renamed from: h */
    public int f26838h;

    /* renamed from: i */
    public int f26839i;

    /* renamed from: j */
    public String f26840j;

    /* renamed from: k */
    public long f26841k;

    /* renamed from: l */
    public String f26842l;

    /* renamed from: m */
    public Exception f26843m;

    /* renamed from: n */
    public String f26844n;

    /* JADX WARN: Code restructure failed: missing block: B:113:0x003d, code lost:
        if (c() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0135, code lost:
        if (r7.getInt("resultCode") == 0) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d(int r10, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r11, byte[] r12, long r13) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sb.d.<init>(int, java.util.Map, byte[], long):void");
    }

    public d(IOException iOException, long j10) {
        this.f26833c = 0;
        this.f26838h = 2;
        this.f26839i = 9001;
        this.f26840j = "";
        this.f26841k = 0L;
        this.f26842l = "";
        this.f26843m = iOException;
        this.f26834d = j10;
    }

    public final void a(HashMap hashMap) {
        long time;
        if (hashMap.containsKey("Cache-Control")) {
            String str = (String) hashMap.get("Cache-Control");
            if (!TextUtils.isEmpty(str) && str.contains("max-age=")) {
                try {
                    time = Long.parseLong(str.substring(str.indexOf("max-age=") + 8));
                    try {
                        Logger.v("d", "Cache-Control value{%s}", Long.valueOf(time));
                    } catch (NumberFormatException e10) {
                        e = e10;
                        Logger.w("d", "getExpireTime addHeadersToResult NumberFormatException", e);
                        long j10 = ((time > 0 || time > 2592000) ? 86400L : 86400L) * 1000;
                        Logger.i("d", "convert expireTime{%s}", Long.valueOf(j10));
                        this.f26840j = String.valueOf(System.currentTimeMillis() + j10);
                    }
                } catch (NumberFormatException e11) {
                    e = e11;
                    time = 0;
                }
            }
            time = 0;
        } else {
            if (hashMap.containsKey("Expires")) {
                String str2 = (String) hashMap.get("Expires");
                Logger.v("d", "expires is{%s}", str2);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss 'GMT'", Locale.ROOT);
                String str3 = hashMap.containsKey("Date") ? (String) hashMap.get("Date") : null;
                try {
                    time = (simpleDateFormat.parse(str2).getTime() - (TextUtils.isEmpty(str3) ? new Date() : simpleDateFormat.parse(str3)).getTime()) / 1000;
                } catch (ParseException e12) {
                    Logger.w("d", "getExpireTime ParseException.", e12);
                }
            } else {
                Logger.i("d", "response headers neither contains Cache-Control nor Expires.");
            }
            time = 0;
        }
        long j102 = ((time > 0 || time > 2592000) ? 86400L : 86400L) * 1000;
        Logger.i("d", "convert expireTime{%s}", Long.valueOf(j102));
        this.f26840j = String.valueOf(System.currentTimeMillis() + j102);
    }

    public final void b(HashMap hashMap) {
        long j10;
        if (hashMap.containsKey("Retry-After")) {
            String str = (String) hashMap.get("Retry-After");
            if (!TextUtils.isEmpty(str)) {
                try {
                    j10 = Long.parseLong(str);
                } catch (NumberFormatException e10) {
                    Logger.w("d", "getRetryAfter addHeadersToResult NumberFormatException", e10);
                }
                long j11 = j10 * 1000;
                Logger.v("d", "convert retry-afterTime{%s}", Long.valueOf(j11));
                this.f26841k = j11;
            }
        }
        j10 = 0;
        long j112 = j10 * 1000;
        Logger.v("d", "convert retry-afterTime{%s}", Long.valueOf(j112));
        this.f26841k = j112;
    }

    public final boolean c() {
        return this.f26833c == 304;
    }

    public final boolean d() {
        return this.f26833c == 200;
    }
}
