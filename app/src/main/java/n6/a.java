package n6;

import java.util.Arrays;

/* loaded from: classes.dex */
public enum a {
    S256,
    PLAIN;

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static a[] valuesCustom() {
        return (a[]) Arrays.copyOf(values(), 2);
    }
}
