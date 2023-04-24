package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a */
    public final Map<Class<?>, Object> f5678a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final HashMap f5679a = new HashMap();
    }

    public i(a aVar) {
        this.f5678a = Collections.unmodifiableMap(new HashMap(aVar.f5679a));
    }
}
