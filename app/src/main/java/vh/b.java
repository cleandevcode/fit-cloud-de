package vh;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import com.topstep.fitcloud.pro.databinding.ItemContactsListBinding;
import com.topstep.fitcloudpro.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import jc.w;
import k1.i2;
import k1.o0;

/* loaded from: classes2.dex */
public final class b extends RecyclerView.e<RecyclerView.b0> {

    /* renamed from: d */
    public ArrayList<rj.c> f29384d;

    /* renamed from: e */
    public InterfaceC0532b f29385e;

    /* renamed from: f */
    public final t f29386f = new t(new d());

    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.b0 {

        /* renamed from: u */
        public final ItemContactsListBinding f29387u;

        public a(ItemContactsListBinding itemContactsListBinding) {
            super(itemContactsListBinding.getRoot());
            this.f29387u = itemContactsListBinding;
        }
    }

    /* renamed from: vh.b$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC0532b {
        void a(int i10);

        void b(int i10, int i11);
    }

    /* loaded from: classes2.dex */
    public static final class c extends RecyclerView.b0 {
        public c(View view) {
            super(view);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends t.d {
        public d() {
            b.this = r1;
        }

        @Override // androidx.recyclerview.widget.t.d
        public final int b(RecyclerView recyclerView, RecyclerView.b0 b0Var) {
            gm.l.f(recyclerView, "recyclerView");
            gm.l.f(b0Var, "viewHolder");
            int i10 = b0Var instanceof a ? 3 : 0;
            return (i10 << 16) | 0 | ((0 | i10) << 0);
        }

        @Override // androidx.recyclerview.widget.t.d
        public final boolean e(RecyclerView recyclerView, RecyclerView.b0 b0Var, RecyclerView.b0 b0Var2) {
            InterfaceC0532b interfaceC0532b;
            gm.l.f(recyclerView, "recyclerView");
            gm.l.f(b0Var, "viewHolder");
            if (b0Var2 instanceof c) {
                return false;
            }
            b bVar = b.this;
            if (bVar.f29384d != null && (interfaceC0532b = bVar.f29385e) != null) {
                interfaceC0532b.b(b0Var.d(), b0Var2.d());
                return true;
            }
            return true;
        }

        @Override // androidx.recyclerview.widget.t.d
        public final void f(RecyclerView.b0 b0Var) {
            gm.l.f(b0Var, "viewHolder");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int e() {
        ArrayList<rj.c> arrayList = this.f29384d;
        return (arrayList != null ? arrayList.size() : 0) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int g(int i10) {
        ArrayList<rj.c> arrayList = this.f29384d;
        return i10 >= (arrayList != null ? arrayList.size() : 0) ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(final RecyclerView.b0 b0Var, int i10) {
        ArrayList<rj.c> arrayList;
        if (!(b0Var instanceof a) || (arrayList = this.f29384d) == null) {
            return;
        }
        rj.c cVar = arrayList.get(i10);
        gm.l.e(cVar, "items[position]");
        rj.c cVar2 = cVar;
        a aVar = (a) b0Var;
        aVar.f29387u.tvName.setText(cVar2.f25769a);
        aVar.f29387u.tvNumber.setText(cVar2.f25770b);
        aVar.f29387u.imgSort.setOnTouchListener(new View.OnTouchListener() { // from class: vh.a
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                String str;
                int i11;
                b bVar = b.this;
                RecyclerView.b0 b0Var2 = b0Var;
                gm.l.f(bVar, "this$0");
                gm.l.f(b0Var2, "$holder");
                if (motionEvent.getAction() == 0) {
                    t tVar = bVar.f29386f;
                    t.d dVar = tVar.f3279m;
                    RecyclerView recyclerView = tVar.f3284r;
                    int b10 = dVar.b(recyclerView, b0Var2);
                    WeakHashMap<View, i2> weakHashMap = o0.f18161a;
                    int d10 = o0.e.d(recyclerView);
                    int i12 = b10 & 3158064;
                    boolean z10 = true;
                    if (i12 != 0) {
                        int i13 = b10 & (~i12);
                        if (d10 == 0) {
                            i11 = i12 >> 2;
                        } else {
                            int i14 = i12 >> 1;
                            i13 |= (-3158065) & i14;
                            i11 = (i14 & 3158064) >> 2;
                        }
                        b10 = i13 | i11;
                    }
                    if ((b10 & 16711680) == 0) {
                        z10 = false;
                    }
                    if (!z10) {
                        str = "Start drag has been called but dragging is not enabled";
                    } else if (b0Var2.f2927a.getParent() != tVar.f3284r) {
                        str = "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.";
                    } else {
                        VelocityTracker velocityTracker = tVar.f3286t;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                        }
                        tVar.f3286t = VelocityTracker.obtain();
                        tVar.f3275i = 0.0f;
                        tVar.f3274h = 0.0f;
                        tVar.r(b0Var2, 2);
                    }
                    Log.e("ItemTouchHelper", str);
                }
                return false;
            }
        });
        aVar.f29387u.tvDelete.setOnClickListener(new w(this, b0Var, 2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.b0 o(RecyclerView recyclerView, int i10) {
        gm.l.f(recyclerView, "parent");
        if (i10 == 0) {
            ItemContactsListBinding inflate = ItemContactsListBinding.inflate(LayoutInflater.from(recyclerView.getContext()), recyclerView, false);
            gm.l.e(inflate, "inflate(\n               …, false\n                )");
            return new a(inflate);
        }
        View inflate2 = LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.item_contacts_tips, (ViewGroup) recyclerView, false);
        gm.l.e(inflate2, "from(parent.context).inf…acts_tips, parent, false)");
        return new c(inflate2);
    }
}
