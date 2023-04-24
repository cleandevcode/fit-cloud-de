package r5;

import java.util.Arrays;

/* loaded from: classes.dex */
public enum i {
    USER_DATA("user_data"),
    APP_DATA("app_data"),
    CUSTOM_DATA("custom_data"),
    /* JADX INFO: Fake field, exist only in values array */
    CUSTOM_EVENTS("custom_events");

    i(String str) {
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static i[] valuesCustom() {
        return (i[]) Arrays.copyOf(values(), 4);
    }
}
