package q6;

import java.util.Arrays;

/* loaded from: classes.dex */
public enum e implements d6.h {
    SHARE_DIALOG(20130618),
    PHOTOS(20140204),
    VIDEO(20141028),
    MULTIMEDIA(20160327),
    /* JADX INFO: Fake field, exist only in values array */
    HASHTAG(20160327),
    /* JADX INFO: Fake field, exist only in values array */
    LINK_SHARE_QUOTES(20160327);
    

    /* renamed from: a */
    public final int f24614a;

    e(int i10) {
        this.f24614a = i10;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static e[] valuesCustom() {
        return (e[]) Arrays.copyOf(values(), 6);
    }

    @Override // d6.h
    public final int a() {
        return this.f24614a;
    }

    @Override // d6.h
    public final String c() {
        return "com.facebook.platform.action.request.FEED_DIALOG";
    }
}
