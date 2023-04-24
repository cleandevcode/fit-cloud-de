package com.sina.weibo.sdk.net;

import android.os.Bundle;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class e implements d {

    /* renamed from: i */
    private String f9504i;

    /* renamed from: j */
    private Bundle f9505j = new Bundle();

    /* renamed from: k */
    private Bundle f9506k = new Bundle();

    /* renamed from: l */
    private Map f9507l = new HashMap();

    /* renamed from: m */
    private Map<String, byte[]> f9508m = new HashMap();

    /* renamed from: n */
    private int f9509n;

    /* renamed from: o */
    private int f9510o;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: i */
        public String f9511i;

        /* renamed from: j */
        public Bundle f9512j = new Bundle();

        /* renamed from: k */
        public Bundle f9513k = new Bundle();

        /* renamed from: l */
        public Map f9514l = new HashMap();

        /* renamed from: m */
        public Map<String, byte[]> f9515m = new HashMap();

        /* renamed from: n */
        public int f9516n = 30000;

        /* renamed from: o */
        public int f9517o = 60000;

        private void a(Bundle bundle, String str, Object obj) {
            if (obj != null) {
                if (obj instanceof String) {
                    bundle.putString(str, String.valueOf(obj));
                } else if (obj instanceof Integer) {
                    bundle.putInt(str, ((Integer) obj).intValue());
                } else if (obj instanceof Short) {
                    bundle.putShort(str, ((Short) obj).shortValue());
                } else if (obj instanceof Character) {
                    bundle.putChar(str, ((Character) obj).charValue());
                } else if (obj instanceof Byte) {
                    bundle.putByte(str, ((Byte) obj).byteValue());
                } else if (obj instanceof Long) {
                    bundle.putLong(str, ((Long) obj).longValue());
                } else if (obj instanceof Float) {
                    bundle.putFloat(str, ((Float) obj).floatValue());
                } else if (obj instanceof Double) {
                    bundle.putDouble(str, ((Double) obj).doubleValue());
                } else if (obj instanceof Boolean) {
                    bundle.putBoolean(str, ((Boolean) obj).booleanValue());
                } else if (obj instanceof byte[]) {
                    this.f9515m.put(str, (byte[]) obj);
                } else if (!(obj instanceof Serializable)) {
                    throw new IllegalArgumentException("Unsupported params type!");
                } else {
                    bundle.putSerializable(str, (Serializable) obj);
                }
            }
        }

        public final a a(String str, Object obj) {
            a(this.f9512j, str, obj);
            return this;
        }

        public final a b(String str, Object obj) {
            a(this.f9513k, str, obj);
            return this;
        }

        public final e e() {
            return new e(this);
        }
    }

    public e(a aVar) {
        this.f9504i = aVar.f9511i;
        this.f9505j.putAll(aVar.f9512j);
        this.f9506k.putAll(aVar.f9513k);
        this.f9507l.putAll(aVar.f9514l);
        this.f9508m.putAll(aVar.f9515m);
        this.f9509n = aVar.f9516n;
        this.f9510o = aVar.f9517o;
    }

    @Override // com.sina.weibo.sdk.net.d
    public final Bundle d() {
        return this.f9506k;
    }

    @Override // com.sina.weibo.sdk.net.d
    public final int getConnectTimeout() {
        return this.f9509n;
    }

    @Override // com.sina.weibo.sdk.net.d
    public final Bundle getParams() {
        return this.f9505j;
    }

    @Override // com.sina.weibo.sdk.net.d
    public final int getReadTimeout() {
        return this.f9510o;
    }

    @Override // com.sina.weibo.sdk.net.d
    public final String getUrl() {
        return this.f9504i;
    }
}
