package p1;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.appcompat.widget.u0;
import p1.b;

/* loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: g */
    public p1.b f23766g;

    /* renamed from: b */
    public boolean f23761b = true;

    /* renamed from: c */
    public Cursor f23762c = null;

    /* renamed from: a */
    public boolean f23760a = false;

    /* renamed from: d */
    public int f23763d = -1;

    /* renamed from: e */
    public C0426a f23764e = new C0426a();

    /* renamed from: f */
    public b f23765f = new b();

    /* renamed from: p1.a$a */
    /* loaded from: classes.dex */
    public class C0426a extends ContentObserver {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0426a() {
            super(new Handler());
            a.this = r1;
        }

        @Override // android.database.ContentObserver
        public final boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z10) {
            Cursor cursor;
            a aVar = a.this;
            if (aVar.f23761b && (cursor = aVar.f23762c) != null && !cursor.isClosed()) {
                aVar.f23760a = aVar.f23762c.requery();
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends DataSetObserver {
        public b() {
            a.this = r1;
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            a aVar = a.this;
            aVar.f23760a = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            a aVar = a.this;
            aVar.f23760a = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context) {
    }

    public abstract void b(View view, Cursor cursor);

    public void c(Cursor cursor) {
        Cursor cursor2 = this.f23762c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                C0426a c0426a = this.f23764e;
                if (c0426a != null) {
                    cursor2.unregisterContentObserver(c0426a);
                }
                b bVar = this.f23765f;
                if (bVar != null) {
                    cursor2.unregisterDataSetObserver(bVar);
                }
            }
            this.f23762c = cursor;
            if (cursor != null) {
                C0426a c0426a2 = this.f23764e;
                if (c0426a2 != null) {
                    cursor.registerContentObserver(c0426a2);
                }
                b bVar2 = this.f23765f;
                if (bVar2 != null) {
                    cursor.registerDataSetObserver(bVar2);
                }
                this.f23763d = cursor.getColumnIndexOrThrow("_id");
                this.f23760a = true;
                notifyDataSetChanged();
            } else {
                this.f23763d = -1;
                this.f23760a = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String d(Cursor cursor);

    public abstract View e(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.f23760a || (cursor = this.f23762c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (this.f23760a) {
            this.f23762c.moveToPosition(i10);
            if (view == null) {
                c cVar = (c) this;
                view = cVar.f23772j.inflate(cVar.f23771i, viewGroup, false);
            }
            b(view, this.f23762c);
            return view;
        }
        return null;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f23766g == null) {
            this.f23766g = new p1.b(this);
        }
        return this.f23766g;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i10) {
        Cursor cursor;
        if (!this.f23760a || (cursor = this.f23762c) == null) {
            return null;
        }
        cursor.moveToPosition(i10);
        return this.f23762c;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        Cursor cursor;
        if (this.f23760a && (cursor = this.f23762c) != null && cursor.moveToPosition(i10)) {
            return this.f23762c.getLong(this.f23763d);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (this.f23760a) {
            if (this.f23762c.moveToPosition(i10)) {
                if (view == null) {
                    view = e(viewGroup);
                }
                b(view, this.f23762c);
                return view;
            }
            throw new IllegalStateException(u0.a("couldn't move cursor to position ", i10));
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }
}
