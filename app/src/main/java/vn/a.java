package vn;

import java.io.File;
import java.io.FilenameFilter;

/* loaded from: classes2.dex */
public final class a implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.endsWith(".msg");
    }
}
