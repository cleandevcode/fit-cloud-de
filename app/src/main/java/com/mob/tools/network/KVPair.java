package com.mob.tools.network;

import com.mob.tools.proguard.PublicMemberKeeper;

/* loaded from: classes.dex */
public class KVPair<T> implements PublicMemberKeeper {
    public final String name;
    public final T value;

    public KVPair(String str, T t10) {
        this.name = str;
        this.value = t10;
    }

    public String toString() {
        return this.name + " = " + this.value;
    }
}
