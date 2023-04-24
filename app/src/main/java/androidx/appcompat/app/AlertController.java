package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.core.widget.NestedScrollView;
import f.p;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class AlertController {
    public TextView A;
    public TextView B;
    public View C;
    public ListAdapter D;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public boolean L;
    public c M;

    /* renamed from: a */
    public final Context f776a;

    /* renamed from: b */
    public final p f777b;

    /* renamed from: c */
    public final Window f778c;

    /* renamed from: d */
    public final int f779d;

    /* renamed from: e */
    public CharSequence f780e;

    /* renamed from: f */
    public CharSequence f781f;

    /* renamed from: g */
    public RecycleListView f782g;

    /* renamed from: h */
    public View f783h;

    /* renamed from: i */
    public int f784i;

    /* renamed from: k */
    public Button f786k;

    /* renamed from: l */
    public CharSequence f787l;

    /* renamed from: m */
    public Message f788m;

    /* renamed from: n */
    public Drawable f789n;

    /* renamed from: o */
    public Button f790o;

    /* renamed from: p */
    public CharSequence f791p;

    /* renamed from: q */
    public Message f792q;

    /* renamed from: r */
    public Drawable f793r;

    /* renamed from: s */
    public Button f794s;

    /* renamed from: t */
    public CharSequence f795t;

    /* renamed from: u */
    public Message f796u;

    /* renamed from: v */
    public Drawable f797v;

    /* renamed from: w */
    public NestedScrollView f798w;

    /* renamed from: y */
    public Drawable f800y;

    /* renamed from: z */
    public ImageView f801z;

    /* renamed from: j */
    public boolean f785j = false;

    /* renamed from: x */
    public int f799x = 0;
    public int E = -1;
    public final a N = new a();

    /* loaded from: classes.dex */
    public static class RecycleListView extends ListView {

        /* renamed from: a */
        public final int f802a;

        /* renamed from: b */
        public final int f803b;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RecycleListView);
            this.f803b = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.RecycleListView_paddingBottomNoButtons, -1);
            this.f802a = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.RecycleListView_paddingTopNoTitle, -1);
        }
    }

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
            AlertController.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Message message;
            Message message2;
            AlertController alertController = AlertController.this;
            Message obtain = ((view != alertController.f786k || (message2 = alertController.f788m) == null) && (view != alertController.f790o || (message2 = alertController.f792q) == null)) ? (view != alertController.f794s || (message = alertController.f796u) == null) ? null : Message.obtain(message) : Message.obtain(message2);
            if (obtain != null) {
                obtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.M.obtainMessage(1, alertController2.f777b).sendToTarget();
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public final Context f805a;

        /* renamed from: b */
        public final LayoutInflater f806b;

        /* renamed from: c */
        public Drawable f807c;

        /* renamed from: d */
        public CharSequence f808d;

        /* renamed from: e */
        public View f809e;

        /* renamed from: f */
        public CharSequence f810f;

        /* renamed from: g */
        public CharSequence f811g;

        /* renamed from: h */
        public DialogInterface.OnClickListener f812h;

        /* renamed from: i */
        public CharSequence f813i;

        /* renamed from: j */
        public DialogInterface.OnClickListener f814j;

        /* renamed from: k */
        public CharSequence f815k;

        /* renamed from: l */
        public DialogInterface.OnClickListener f816l;

        /* renamed from: n */
        public DialogInterface.OnKeyListener f818n;

        /* renamed from: o */
        public CharSequence[] f819o;

        /* renamed from: p */
        public ListAdapter f820p;

        /* renamed from: q */
        public DialogInterface.OnClickListener f821q;

        /* renamed from: r */
        public int f822r;

        /* renamed from: s */
        public View f823s;

        /* renamed from: t */
        public boolean[] f824t;

        /* renamed from: u */
        public boolean f825u;

        /* renamed from: v */
        public boolean f826v;

        /* renamed from: x */
        public DialogInterface.OnMultiChoiceClickListener f828x;

        /* renamed from: w */
        public int f827w = -1;

        /* renamed from: m */
        public boolean f817m = true;

        public b(ContextThemeWrapper contextThemeWrapper) {
            this.f805a = contextThemeWrapper;
            this.f806b = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends Handler {

        /* renamed from: a */
        public WeakReference<DialogInterface> f829a;

        public c(DialogInterface dialogInterface) {
            this.f829a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == -3 || i10 == -2 || i10 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f829a.get(), message.what);
            } else if (i10 != 1) {
            } else {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class d extends ArrayAdapter<CharSequence> {
        public d(Context context, int i10, CharSequence[] charSequenceArr) {
            super(context, i10, 16908308, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, p pVar, Window window) {
        this.f776a = context;
        this.f777b = pVar;
        this.f778c = window;
        this.M = new c(pVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, R.styleable.AlertDialog, R.attr.alertDialogStyle, 0);
        this.F = obtainStyledAttributes.getResourceId(R.styleable.AlertDialog_android_layout, 0);
        this.G = obtainStyledAttributes.getResourceId(R.styleable.AlertDialog_buttonPanelSideLayout, 0);
        this.H = obtainStyledAttributes.getResourceId(R.styleable.AlertDialog_listLayout, 0);
        this.I = obtainStyledAttributes.getResourceId(R.styleable.AlertDialog_multiChoiceItemLayout, 0);
        this.J = obtainStyledAttributes.getResourceId(R.styleable.AlertDialog_singleChoiceItemLayout, 0);
        this.K = obtainStyledAttributes.getResourceId(R.styleable.AlertDialog_listItemLayout, 0);
        this.L = obtainStyledAttributes.getBoolean(R.styleable.AlertDialog_showTitle, true);
        this.f779d = obtainStyledAttributes.getDimensionPixelSize(R.styleable.AlertDialog_buttonIconDimen, 0);
        obtainStyledAttributes.recycle();
        pVar.h();
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (childCount > 0) {
                childCount--;
                if (a(viewGroup.getChildAt(childCount))) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static void b(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    public static ViewGroup c(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void d(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message obtainMessage = onClickListener != null ? this.M.obtainMessage(i10, onClickListener) : null;
        if (i10 == -3) {
            this.f795t = charSequence;
            this.f796u = obtainMessage;
            this.f797v = null;
        } else if (i10 == -2) {
            this.f791p = charSequence;
            this.f792q = obtainMessage;
            this.f793r = null;
        } else if (i10 != -1) {
            throw new IllegalArgumentException("Button does not exist");
        } else {
            this.f787l = charSequence;
            this.f788m = obtainMessage;
            this.f789n = null;
        }
    }
}
