package android.support.v4.media;

import com.mob.tools.utils.Hashon;
import java.util.HashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class d {
    public static StringBuilder a(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        return sb2;
    }

    public static HashMap b(String str) {
        return new Hashon().fromJson(str);
    }
}
