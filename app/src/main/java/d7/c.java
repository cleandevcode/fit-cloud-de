package d7;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.github.kilnn.tool.R;
import f.p;
import gm.l;
import java.lang.ref.SoftReference;
import o1.g;
import p000do.a;
import v2.d;

/* loaded from: classes.dex */
public final class c extends p {
    public static final /* synthetic */ int B = 0;
    public SoftReference<v2.d> A;

    /* renamed from: e */
    public final int f12830e;

    /* renamed from: f */
    public final int f12831f;

    /* renamed from: g */
    public final int f12832g;

    /* renamed from: h */
    public final int f12833h;

    /* renamed from: i */
    public final int f12834i;

    /* renamed from: j */
    public final int f12835j;

    /* renamed from: k */
    public final int f12836k;

    /* renamed from: l */
    public final int f12837l;

    /* renamed from: m */
    public final int f12838m;

    /* renamed from: n */
    public final int f12839n;

    /* renamed from: o */
    public final int f12840o;

    /* renamed from: p */
    public final int f12841p;

    /* renamed from: q */
    public View f12842q;

    /* renamed from: r */
    public TextView f12843r;

    /* renamed from: s */
    public ImageView f12844s;

    /* renamed from: t */
    public int f12845t;

    /* renamed from: u */
    public String f12846u;

    /* renamed from: v */
    public boolean f12847v;

    /* renamed from: w */
    public boolean f12848w;

    /* renamed from: x */
    public final b f12849x;

    /* renamed from: y */
    public DialogInterface.OnDismissListener f12850y;

    /* renamed from: z */
    public SoftReference<v2.d> f12851z;

    /* loaded from: classes.dex */
    public static final class a {
        public static final int a(Context context, int i10) {
            int i11 = c.B;
            if (i10 == 0) {
                TypedValue typedValue = new TypedValue();
                if (context.getTheme().resolveAttribute(R.attr.promptDialogTheme, typedValue, true)) {
                    return typedValue.resourceId;
                }
                return R.style.BasePromptDialogTheme;
            }
            return i10;
        }
    }

    static {
        new a();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [d7.b] */
    public c(Context context, int i10) {
        super(context, a.a(context, i10));
        this.f12848w = true;
        this.f12849x = new DialogInterface.OnDismissListener() { // from class: d7.b
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                Drawable drawable;
                c cVar = c.this;
                l.f(cVar, "this$0");
                ImageView imageView = cVar.f12844s;
                if (imageView != null && (drawable = imageView.getDrawable()) != null && (drawable instanceof v2.d)) {
                    v2.d dVar = (v2.d) drawable;
                    if (dVar.isRunning()) {
                        dVar.stop();
                    }
                }
                DialogInterface.OnDismissListener onDismissListener = cVar.f12850y;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(dialogInterface);
                }
            }
        };
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(a.a(context, i10), R.styleable.PromptDialog);
        l.e(obtainStyledAttributes, "context.obtainStyledAttr…R.styleable.PromptDialog)");
        this.f12830e = obtainStyledAttributes.getResourceId(R.styleable.PromptDialog_prompt_layout, R.layout.dialog_prompt);
        this.f12831f = obtainStyledAttributes.getResourceId(R.styleable.PromptDialog_prompt_background, R.drawable.prompt_dft_background);
        this.f12832g = obtainStyledAttributes.getResourceId(R.styleable.PromptDialog_prompt_icon_info, R.drawable.ic_outline_info_48);
        this.f12833h = obtainStyledAttributes.getResourceId(R.styleable.PromptDialog_prompt_icon_success, R.drawable.ic_round_done_48);
        this.f12834i = obtainStyledAttributes.getResourceId(R.styleable.PromptDialog_prompt_icon_failed, R.drawable.ic_round_close_48);
        this.f12835j = obtainStyledAttributes.getColor(R.styleable.PromptDialog_prompt_icon_tint_color, y0.a.b(context, R.color.dft_prompt_icon_tint_color));
        this.f12836k = obtainStyledAttributes.getColor(R.styleable.PromptDialog_prompt_text_color, y0.a.b(context, R.color.dft_prompt_text_color));
        this.f12837l = obtainStyledAttributes.getDimensionPixelSize(R.styleable.PromptDialog_prompt_icon_normal_size, 0);
        this.f12838m = obtainStyledAttributes.getDimensionPixelSize(R.styleable.PromptDialog_prompt_icon_progress_default_size, context.getResources().getDimensionPixelSize(R.dimen.dft_prompt_icon_progress_default_size));
        this.f12839n = obtainStyledAttributes.getDimensionPixelSize(R.styleable.PromptDialog_prompt_icon_progress_large_size, context.getResources().getDimensionPixelSize(R.dimen.dft_prompt_icon_progress_large_size));
        this.f12840o = obtainStyledAttributes.getInt(R.styleable.PromptDialog_prompt_gravity, 17);
        this.f12841p = obtainStyledAttributes.getDimensionPixelSize(R.styleable.PromptDialog_prompt_margin_bottom, 0);
        obtainStyledAttributes.recycle();
    }

    public final void j() {
        ViewGroup.LayoutParams layoutParams;
        int i10;
        ViewGroup.LayoutParams layoutParams2;
        int i11;
        ImageView imageView = this.f12844s;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof v2.d) {
                v2.d dVar = (v2.d) drawable;
                if (dVar.isRunning()) {
                    dVar.stop();
                }
            }
            int i12 = this.f12845t;
            int i13 = 0;
            if (i12 == 4) {
                boolean z10 = !TextUtils.isEmpty(this.f12846u);
                ViewGroup.LayoutParams layoutParams3 = imageView.getLayoutParams();
                if (z10) {
                    layoutParams3.width = this.f12838m;
                    layoutParams2 = imageView.getLayoutParams();
                    i11 = this.f12838m;
                } else {
                    layoutParams3.width = this.f12839n;
                    layoutParams2 = imageView.getLayoutParams();
                    i11 = this.f12839n;
                }
                layoutParams2.height = i11;
                v2.d dVar2 = null;
                if (z10) {
                    SoftReference<v2.d> softReference = this.f12851z;
                    if (softReference != null) {
                        dVar2 = softReference.get();
                    }
                    if (dVar2 == null) {
                        dVar2 = m(true);
                        this.f12851z = new SoftReference<>(dVar2);
                    }
                } else {
                    SoftReference<v2.d> softReference2 = this.A;
                    if (softReference2 != null) {
                        dVar2 = softReference2.get();
                    }
                    if (dVar2 == null) {
                        dVar2 = m(false);
                        this.A = new SoftReference<>(dVar2);
                    }
                }
                imageView.setImageDrawable(dVar2);
                dVar2.start();
                return;
            }
            if (this.f12837l <= 0) {
                i10 = -2;
                imageView.getLayoutParams().width = -2;
                layoutParams = imageView.getLayoutParams();
            } else {
                imageView.getLayoutParams().width = this.f12837l;
                layoutParams = imageView.getLayoutParams();
                i10 = this.f12837l;
            }
            layoutParams.height = i10;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 3) {
                        i13 = this.f12834i;
                    }
                } else {
                    i13 = this.f12833h;
                }
            } else {
                i13 = this.f12832g;
            }
            imageView.setImageResource(i13);
        }
    }

    public final void l() {
        TextView textView = this.f12843r;
        if (textView != null) {
            if (TextUtils.isEmpty(this.f12846u)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(this.f12846u);
            }
        }
        try {
            Window window = getWindow();
            if (window != null) {
                if (this.f12847v) {
                    window.clearFlags(24);
                } else {
                    window.addFlags(24);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        this.f12848w = true;
    }

    public final v2.d m(boolean z10) {
        int i10;
        v2.d dVar = new v2.d(getContext());
        float f10 = getContext().getResources().getDisplayMetrics().density;
        if (z10) {
            float f11 = f10 * 2.5f;
            d.a aVar = dVar.f29001a;
            aVar.f29014h = f11;
            aVar.f29008b.setStrokeWidth(f11);
            dVar.invalidateSelf();
            i10 = this.f12838m;
        } else {
            float f12 = getContext().getResources().getDisplayMetrics().density * 3.5f;
            d.a aVar2 = dVar.f29001a;
            aVar2.f29014h = f12;
            aVar2.f29008b.setStrokeWidth(f12);
            dVar.invalidateSelf();
            i10 = this.f12839n;
        }
        dVar.b(((i10 * 0.7f) / 2) - dVar.f29001a.f29014h);
        dVar.f29001a.f29010d.setColor(0);
        dVar.invalidateSelf();
        d.a aVar3 = dVar.f29001a;
        if (aVar3.f29020n) {
            aVar3.f29020n = false;
        }
        dVar.invalidateSelf();
        dVar.setAlpha(255);
        int[] iArr = {this.f12835j};
        d.a aVar4 = dVar.f29001a;
        aVar4.f29015i = iArr;
        aVar4.a(0);
        dVar.f29001a.a(0);
        dVar.invalidateSelf();
        return dVar;
    }

    @Override // f.p, androidx.activity.j, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        Window window;
        super.onCreate(bundle);
        View inflate = getLayoutInflater().inflate(this.f12830e, (ViewGroup) null);
        l.e(inflate, "layoutInflater.inflate(layoutId, null)");
        this.f12842q = inflate;
        setContentView(inflate);
        this.f12843r = (TextView) findViewById(R.id.view_prompt_text);
        this.f12844s = (ImageView) findViewById(R.id.view_prompt_img);
        View view = this.f12842q;
        if (view != null) {
            view.setBackgroundResource(this.f12831f);
            ImageView imageView = this.f12844s;
            if (imageView != null) {
                g.a(imageView, ColorStateList.valueOf(this.f12835j));
            }
            TextView textView = this.f12843r;
            if (textView != null) {
                textView.setTextColor(this.f12836k);
            }
            setOnDismissListener(this.f12849x);
            if (this.f12840o != 17 && (window = getWindow()) != null) {
                window.getAttributes().y = this.f12841p;
                window.setGravity(this.f12840o);
                return;
            }
            return;
        }
        l.l("viewRoot");
        throw null;
    }

    @Override // androidx.activity.j, android.app.Dialog
    public final void onStart() {
        super.onStart();
        if (this.f12848w) {
            a.b bVar = p000do.a.f13275a;
            bVar.t("PromptDialog");
            bVar.p("Are you forget use setPrompt?", new Object[0]);
        }
        j();
        l();
    }

    @Override // android.app.Dialog
    public final void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        if (onDismissListener == this.f12849x) {
            super.setOnDismissListener(onDismissListener);
        } else {
            this.f12850y = onDismissListener;
        }
    }
}
