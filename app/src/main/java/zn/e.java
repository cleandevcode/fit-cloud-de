package zn;

import java.io.File;
import java.io.FilenameFilter;

/* loaded from: classes2.dex */
public final class e implements FilenameFilter {

    /* renamed from: a */
    public final /* synthetic */ String f32770a;

    public e(String str) {
        this.f32770a = str;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.startsWith(this.f32770a);
    }
}
