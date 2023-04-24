package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.R;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class f2 extends p1.c implements View.OnClickListener {

    /* renamed from: x */
    public static final /* synthetic */ int f1330x = 0;

    /* renamed from: k */
    public final SearchView f1331k;

    /* renamed from: l */
    public final SearchableInfo f1332l;

    /* renamed from: m */
    public final Context f1333m;

    /* renamed from: n */
    public final WeakHashMap<String, Drawable.ConstantState> f1334n;

    /* renamed from: o */
    public final int f1335o;

    /* renamed from: p */
    public int f1336p;

    /* renamed from: q */
    public ColorStateList f1337q;

    /* renamed from: r */
    public int f1338r;

    /* renamed from: s */
    public int f1339s;

    /* renamed from: t */
    public int f1340t;

    /* renamed from: u */
    public int f1341u;

    /* renamed from: v */
    public int f1342v;

    /* renamed from: w */
    public int f1343w;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final TextView f1344a;

        /* renamed from: b */
        public final TextView f1345b;

        /* renamed from: c */
        public final ImageView f1346c;

        /* renamed from: d */
        public final ImageView f1347d;

        /* renamed from: e */
        public final ImageView f1348e;

        public a(View view) {
            this.f1344a = (TextView) view.findViewById(16908308);
            this.f1345b = (TextView) view.findViewById(16908309);
            this.f1346c = (ImageView) view.findViewById(16908295);
            this.f1347d = (ImageView) view.findViewById(16908296);
            this.f1348e = (ImageView) view.findViewById(R.id.edit_query);
        }
    }

    public f2(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout());
        this.f1336p = 1;
        this.f1338r = -1;
        this.f1339s = -1;
        this.f1340t = -1;
        this.f1341u = -1;
        this.f1342v = -1;
        this.f1343w = -1;
        this.f1331k = searchView;
        this.f1332l = searchableInfo;
        this.f1335o = searchView.getSuggestionCommitIconResId();
        this.f1333m = context;
        this.f1334n = weakHashMap;
    }

    public static String i(Cursor cursor, int i10) {
        if (i10 == -1) {
            return null;
        }
        try {
            return cursor.getString(i10);
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e10);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:156:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0140  */
    @Override // p1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.view.View r18, android.database.Cursor r19) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.f2.b(android.view.View, android.database.Cursor):void");
    }

    @Override // p1.a
    public final void c(Cursor cursor) {
        try {
            super.c(cursor);
            if (cursor != null) {
                this.f1338r = cursor.getColumnIndex("suggest_text_1");
                this.f1339s = cursor.getColumnIndex("suggest_text_2");
                this.f1340t = cursor.getColumnIndex("suggest_text_2_url");
                this.f1341u = cursor.getColumnIndex("suggest_icon_1");
                this.f1342v = cursor.getColumnIndex("suggest_icon_2");
                this.f1343w = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e10);
        }
    }

    @Override // p1.a
    public final String d(Cursor cursor) {
        String i10;
        String i11;
        if (cursor == null) {
            return null;
        }
        String i12 = i(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (i12 != null) {
            return i12;
        }
        if (this.f1332l.shouldRewriteQueryFromData() && (i11 = i(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return i11;
        }
        if (!this.f1332l.shouldRewriteQueryFromText() || (i10 = i(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return i10;
    }

    @Override // p1.a
    public final View e(ViewGroup viewGroup) {
        View inflate = this.f23772j.inflate(this.f23770h, viewGroup, false);
        inflate.setTag(new a(inflate));
        ((ImageView) inflate.findViewById(R.id.edit_query)).setImageResource(this.f1335o);
        return inflate;
    }

    public final Drawable f(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f1333m.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    parseInt = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else if (size != 2) {
                throw new FileNotFoundException("More than two path segments: " + uri);
            } else {
                parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (parseInt != 0) {
                return resourcesForApplication.getDrawable(parseInt);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable g(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.f2.g(java.lang.String):android.graphics.drawable.Drawable");
    }

    @Override // p1.a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View inflate = this.f23772j.inflate(this.f23771i, viewGroup, false);
            if (inflate != null) {
                ((a) inflate.getTag()).f1344a.setText(e10.toString());
            }
            return inflate;
        }
    }

    @Override // p1.a, android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View e11 = e(viewGroup);
            ((a) e11.getTag()).f1344a.setText(e10.toString());
            return e11;
        }
    }

    public final Cursor h(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        fragment.appendQueryParameter("limit", String.valueOf(50));
        return this.f1333m.getContentResolver().query(fragment.build(), null, suggestSelection, strArr, null);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        Bundle bundle;
        super.notifyDataSetChanged();
        Cursor cursor = this.f23762c;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        Bundle bundle;
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f23762c;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f1331k.p((CharSequence) tag);
        }
    }
}
