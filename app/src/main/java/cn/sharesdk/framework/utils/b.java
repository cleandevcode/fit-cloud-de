package cn.sharesdk.framework.utils;

import android.util.Base64;
import com.mob.tools.network.KVPair;
import com.sina.weibo.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a */
    private C0084b f5291a = new C0084b();

    /* renamed from: b */
    private d f5292b = new d("-._~", false);

    /* renamed from: cn.sharesdk.framework.utils.b$1 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f5293a;

        static {
            int[] iArr = new int[a.values().length];
            f5293a = iArr;
            try {
                iArr[a.HMAC_SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5293a[a.PLAINTEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum a {
        HMAC_SHA1,
        PLAINTEXT
    }

    /* renamed from: cn.sharesdk.framework.utils.b$b */
    /* loaded from: classes.dex */
    public static class C0084b {

        /* renamed from: a */
        public String f5297a;

        /* renamed from: b */
        public String f5298b;

        /* renamed from: c */
        public String f5299c;

        /* renamed from: d */
        public String f5300d;

        /* renamed from: e */
        public String f5301e;
    }

    private ArrayList<KVPair<String>> a(long j10, String str) {
        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
        arrayList.add(new KVPair<>("oauth_consumer_key", this.f5291a.f5297a));
        arrayList.add(new KVPair<>("oauth_signature_method", str));
        arrayList.add(new KVPair<>("oauth_timestamp", String.valueOf(j10 / 1000)));
        arrayList.add(new KVPair<>("oauth_nonce", String.valueOf(j10)));
        arrayList.add(new KVPair<>("oauth_version", BuildConfig.VERSION_NAME));
        String str2 = this.f5291a.f5299c;
        if (str2 != null && str2.length() > 0) {
            arrayList.add(new KVPair<>("oauth_token", str2));
        }
        return arrayList;
    }

    private ArrayList<KVPair<String>> a(long j10, ArrayList<KVPair<String>> arrayList, String str) {
        HashMap hashMap = new HashMap();
        if (arrayList != null) {
            Iterator<KVPair<String>> it = arrayList.iterator();
            while (it.hasNext()) {
                KVPair<String> next = it.next();
                hashMap.put(a(next.name), a(next.value));
            }
        }
        ArrayList<KVPair<String>> a10 = a(j10, str);
        if (a10 != null) {
            Iterator<KVPair<String>> it2 = a10.iterator();
            while (it2.hasNext()) {
                KVPair<String> next2 = it2.next();
                hashMap.put(a(next2.name), a(next2.value));
            }
        }
        int size = hashMap.size();
        String[] strArr = new String[size];
        int i10 = 0;
        for (Map.Entry entry : hashMap.entrySet()) {
            strArr[i10] = (String) entry.getKey();
            i10++;
        }
        Arrays.sort(strArr);
        ArrayList<KVPair<String>> arrayList2 = new ArrayList<>();
        for (int i11 = 0; i11 < size; i11++) {
            String str2 = strArr[i11];
            arrayList2.add(new KVPair<>(str2, hashMap.get(str2)));
        }
        return arrayList2;
    }

    private ArrayList<KVPair<String>> a(String str, String str2, ArrayList<KVPair<String>> arrayList, a aVar) {
        String trim;
        long currentTimeMillis = System.currentTimeMillis();
        int i10 = AnonymousClass1.f5293a[aVar.ordinal()];
        String str3 = null;
        if (i10 == 1) {
            SecretKeySpec secretKeySpec = new SecretKeySpec((a(this.f5291a.f5298b) + '&' + a(this.f5291a.f5300d)).getBytes("utf-8"), "HMAC-SHA1");
            Mac mac = Mac.getInstance("HMAC-SHA1");
            mac.init(secretKeySpec);
            String b10 = b(a(currentTimeMillis, arrayList, "HMAC-SHA1"));
            trim = new String(Base64.encode(mac.doFinal((str2 + '&' + a(str) + '&' + a(b10)).getBytes("utf-8")), 0)).trim();
            str3 = "HMAC-SHA1";
        } else if (i10 != 2) {
            trim = null;
        } else {
            str3 = "PLAINTEXT";
            trim = a(this.f5291a.f5298b) + '&' + a(this.f5291a.f5300d);
        }
        ArrayList<KVPair<String>> a10 = a(currentTimeMillis, str3);
        a10.add(new KVPair<>("oauth_signature", trim));
        return a10;
    }

    private String b(ArrayList<KVPair<String>> arrayList) {
        if (arrayList == null || arrayList.size() <= 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        Iterator<KVPair<String>> it = arrayList.iterator();
        while (it.hasNext()) {
            KVPair<String> next = it.next();
            if (i10 > 0) {
                sb2.append('&');
            }
            sb2.append(next.name);
            sb2.append('=');
            sb2.append(next.value);
            i10++;
        }
        return sb2.toString();
    }

    public C0084b a() {
        return this.f5291a;
    }

    public String a(String str) {
        return str == null ? "" : this.f5292b.escape(str);
    }

    public ArrayList<KVPair<String>> a(String str, ArrayList<KVPair<String>> arrayList) {
        return a(str, arrayList, a.HMAC_SHA1);
    }

    public ArrayList<KVPair<String>> a(String str, ArrayList<KVPair<String>> arrayList, a aVar) {
        return a(str, "POST", arrayList, aVar);
    }

    public ArrayList<KVPair<String>> a(ArrayList<KVPair<String>> arrayList) {
        StringBuilder sb2 = new StringBuilder("OAuth ");
        Iterator<KVPair<String>> it = arrayList.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            KVPair<String> next = it.next();
            if (i10 > 0) {
                sb2.append(',');
            }
            String a10 = a(next.value);
            sb2.append(next.name);
            sb2.append("=\"");
            sb2.append(a10);
            sb2.append("\"");
            i10++;
        }
        ArrayList<KVPair<String>> arrayList2 = new ArrayList<>();
        arrayList2.add(new KVPair<>("Authorization", sb2.toString()));
        arrayList2.add(new KVPair<>("Content-Type", "application/x-www-form-urlencoded"));
        return arrayList2;
    }

    public void a(String str, String str2) {
        C0084b c0084b = this.f5291a;
        c0084b.f5299c = str;
        c0084b.f5300d = str2;
    }

    public void a(String str, String str2, String str3) {
        C0084b c0084b = this.f5291a;
        c0084b.f5297a = str;
        c0084b.f5298b = str2;
        c0084b.f5301e = str3;
    }

    public ArrayList<KVPair<String>> b(String str, ArrayList<KVPair<String>> arrayList) {
        return b(str, arrayList, a.HMAC_SHA1);
    }

    public ArrayList<KVPair<String>> b(String str, ArrayList<KVPair<String>> arrayList, a aVar) {
        return a(str, "GET", arrayList, aVar);
    }

    public ArrayList<KVPair<String>> c(String str, ArrayList<KVPair<String>> arrayList, a aVar) {
        return a(str, "PUT", arrayList, aVar);
    }
}
