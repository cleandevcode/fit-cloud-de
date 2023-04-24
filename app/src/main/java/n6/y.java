package n6;

import java.util.Arrays;

/* loaded from: classes.dex */
public enum y {
    FACEBOOK("facebook"),
    INSTAGRAM("instagram");
    

    /* renamed from: a */
    public final String f22190a;

    y(String str) {
        this.f22190a = str;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static y[] valuesCustom() {
        return (y[]) Arrays.copyOf(values(), 2);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f22190a;
    }
}
