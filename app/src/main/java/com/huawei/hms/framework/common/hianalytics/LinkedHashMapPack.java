package com.huawei.hms.framework.common.hianalytics;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public class LinkedHashMapPack {

    /* renamed from: a */
    public LinkedHashMap<String, String> f7061a = new LinkedHashMap<>();

    public LinkedHashMap<String, String> getAll() {
        return this.f7061a;
    }

    public LinkedHashMapPack put(String str, long j10) {
        if (str != null) {
            LinkedHashMap<String, String> linkedHashMap = this.f7061a;
            linkedHashMap.put(str, "" + j10);
        }
        return this;
    }

    public LinkedHashMapPack put(String str, String str2) {
        if (str != null && str2 != null) {
            this.f7061a.put(str, str2);
        }
        return this;
    }

    public LinkedHashMapPack put(String str, boolean z10) {
        LinkedHashMap<String, String> linkedHashMap;
        String str2;
        if (str != null) {
            if (z10) {
                linkedHashMap = this.f7061a;
                str2 = "1";
            } else {
                linkedHashMap = this.f7061a;
                str2 = "0";
            }
            linkedHashMap.put(str, str2);
        }
        return this;
    }

    public LinkedHashMapPack putIfNotDefault(String str, long j10, long j11) {
        return j10 == j11 ? this : put(str, j10);
    }
}
