package p1;

import android.database.Cursor;
import android.widget.Filter;
import androidx.appcompat.widget.f2;

/* loaded from: classes.dex */
public final class b extends Filter {

    /* renamed from: a */
    public a f23769a;

    /* loaded from: classes.dex */
    public interface a {
    }

    public b(a aVar) {
        this.f23769a = aVar;
    }

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        return ((f2) this.f23769a).d((Cursor) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0047  */
    @Override // android.widget.Filter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r4) {
        /*
            r3 = this;
            p1.b$a r0 = r3.f23769a
            androidx.appcompat.widget.f2 r0 = (androidx.appcompat.widget.f2) r0
            if (r4 != 0) goto L9
            java.lang.String r4 = ""
            goto L10
        L9:
            r0.getClass()
            java.lang.String r4 = r4.toString()
        L10:
            androidx.appcompat.widget.SearchView r1 = r0.f1331k
            int r1 = r1.getVisibility()
            r2 = 0
            if (r1 != 0) goto L36
            androidx.appcompat.widget.SearchView r1 = r0.f1331k
            int r1 = r1.getWindowVisibility()
            if (r1 == 0) goto L22
            goto L36
        L22:
            android.app.SearchableInfo r1 = r0.f1332l     // Catch: java.lang.RuntimeException -> L2e
            android.database.Cursor r4 = r0.h(r1, r4)     // Catch: java.lang.RuntimeException -> L2e
            if (r4 == 0) goto L36
            r4.getCount()     // Catch: java.lang.RuntimeException -> L2e
            goto L37
        L2e:
            r4 = move-exception
            java.lang.String r0 = "SuggestionsAdapter"
            java.lang.String r1 = "Search suggestions query threw an exception."
            android.util.Log.w(r0, r1, r4)
        L36:
            r4 = r2
        L37:
            android.widget.Filter$FilterResults r0 = new android.widget.Filter$FilterResults
            r0.<init>()
            if (r4 == 0) goto L47
            int r1 = r4.getCount()
            r0.count = r1
            r0.values = r4
            goto L4c
        L47:
            r4 = 0
            r0.count = r4
            r0.values = r2
        L4c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.b.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        a aVar = this.f23769a;
        Cursor cursor = ((p1.a) aVar).f23762c;
        Object obj = filterResults.values;
        if (obj != null && obj != cursor) {
            ((f2) aVar).c((Cursor) obj);
        }
    }
}
