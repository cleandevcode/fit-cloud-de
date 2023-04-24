package n6;

import java.util.Arrays;

/* loaded from: classes.dex */
public enum d {
    NONE(null),
    /* JADX INFO: Fake field, exist only in values array */
    ONLY_ME("only_me"),
    FRIENDS("friends"),
    /* JADX INFO: Fake field, exist only in values array */
    EVERYONE("everyone");
    

    /* renamed from: a */
    public final String f22072a;

    d(String str) {
        this.f22072a = str;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static d[] valuesCustom() {
        return (d[]) Arrays.copyOf(values(), 4);
    }
}
