package o1;

import android.widget.ListView;

/* loaded from: classes.dex */
public final class i {
    public static boolean a(ListView listView, int i10) {
        return listView.canScrollList(i10);
    }

    public static void b(ListView listView, int i10) {
        listView.scrollListBy(i10);
    }
}
