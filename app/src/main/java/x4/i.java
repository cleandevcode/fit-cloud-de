package x4;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class i implements g {

    /* renamed from: b */
    public final Map<String, List<h>> f30220b;

    /* renamed from: c */
    public volatile Map<String, String> f30221c;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: b */
        public static final Map<String, List<h>> f30222b;

        /* renamed from: a */
        public Map<String, List<h>> f30223a = f30222b;

        static {
            String property = System.getProperty("http.agent");
            if (!TextUtils.isEmpty(property)) {
                int length = property.length();
                StringBuilder sb2 = new StringBuilder(property.length());
                for (int i10 = 0; i10 < length; i10++) {
                    char charAt = property.charAt(i10);
                    if ((charAt <= 31 && charAt != '\t') || charAt >= 127) {
                        charAt = '?';
                    }
                    sb2.append(charAt);
                }
                property = sb2.toString();
            }
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(property)) {
                hashMap.put("User-Agent", Collections.singletonList(new b(property)));
            }
            f30222b = Collections.unmodifiableMap(hashMap);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements h {

        /* renamed from: a */
        public final String f30224a;

        public b(String str) {
            this.f30224a = str;
        }

        @Override // x4.h
        public final String a() {
            return this.f30224a;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f30224a.equals(((b) obj).f30224a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f30224a.hashCode();
        }

        public final String toString() {
            StringBuilder a10 = android.support.v4.media.d.a("StringHeaderFactory{value='");
            a10.append(this.f30224a);
            a10.append('\'');
            a10.append('}');
            return a10.toString();
        }
    }

    public i(Map<String, List<h>> map) {
        this.f30220b = Collections.unmodifiableMap(map);
    }

    @Override // x4.g
    public final Map<String, String> a() {
        if (this.f30221c == null) {
            synchronized (this) {
                if (this.f30221c == null) {
                    this.f30221c = Collections.unmodifiableMap(b());
                }
            }
        }
        return this.f30221c;
    }

    public final HashMap b() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, List<h>> entry : this.f30220b.entrySet()) {
            List<h> value = entry.getValue();
            StringBuilder sb2 = new StringBuilder();
            int size = value.size();
            for (int i10 = 0; i10 < size; i10++) {
                String a10 = value.get(i10).a();
                if (!TextUtils.isEmpty(a10)) {
                    sb2.append(a10);
                    if (i10 != value.size() - 1) {
                        sb2.append(',');
                    }
                }
            }
            String sb3 = sb2.toString();
            if (!TextUtils.isEmpty(sb3)) {
                hashMap.put(entry.getKey(), sb3);
            }
        }
        return hashMap;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f30220b.equals(((i) obj).f30220b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f30220b.hashCode();
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("LazyHeaders{headers=");
        a10.append(this.f30220b);
        a10.append('}');
        return a10.toString();
    }
}
