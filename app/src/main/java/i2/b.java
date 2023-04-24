package i2;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import androidx.navigation.R;
import cn.sharesdk.framework.InnerShareParams;
import i2.h0;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;

@h0.b(InnerShareParams.ACTIVITY)
@Metadata
/* loaded from: classes.dex */
public class b extends h0<a> {

    /* renamed from: c */
    public final Context f16226c;

    /* renamed from: d */
    public final Activity f16227d;

    /* loaded from: classes.dex */
    public static class a extends v {

        /* renamed from: k */
        public Intent f16228k;

        /* renamed from: l */
        public String f16229l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h0<? extends a> h0Var) {
            super(h0Var);
            gm.l.f(h0Var, "activityNavigator");
        }

        @Override // i2.v
        public final boolean equals(Object obj) {
            if (obj != null && (obj instanceof a) && super.equals(obj)) {
                Intent intent = this.f16228k;
                return (intent != null ? intent.filterEquals(((a) obj).f16228k) : ((a) obj).f16228k == null) && gm.l.a(this.f16229l, ((a) obj).f16229l);
            }
            return false;
        }

        @Override // i2.v
        public final int hashCode() {
            int hashCode = super.hashCode() * 31;
            Intent intent = this.f16228k;
            int filterHashCode = (hashCode + (intent != null ? intent.filterHashCode() : 0)) * 31;
            String str = this.f16229l;
            return filterHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // i2.v
        public final void o(Context context, AttributeSet attributeSet) {
            gm.l.f(context, "context");
            super.o(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.ActivityNavigator);
            gm.l.e(obtainAttributes, "context.resources.obtain…tyNavigator\n            )");
            String string = obtainAttributes.getString(R.styleable.ActivityNavigator_targetPackage);
            if (string != null) {
                String packageName = context.getPackageName();
                gm.l.e(packageName, "context.packageName");
                string = om.h.Y(string, "${applicationId}", packageName);
            }
            if (this.f16228k == null) {
                this.f16228k = new Intent();
            }
            Intent intent = this.f16228k;
            gm.l.c(intent);
            intent.setPackage(string);
            String string2 = obtainAttributes.getString(R.styleable.ActivityNavigator_android_name);
            if (string2 != null) {
                if (string2.charAt(0) == '.') {
                    string2 = context.getPackageName() + string2;
                }
                ComponentName componentName = new ComponentName(context, string2);
                if (this.f16228k == null) {
                    this.f16228k = new Intent();
                }
                Intent intent2 = this.f16228k;
                gm.l.c(intent2);
                intent2.setComponent(componentName);
            }
            String string3 = obtainAttributes.getString(R.styleable.ActivityNavigator_action);
            if (this.f16228k == null) {
                this.f16228k = new Intent();
            }
            Intent intent3 = this.f16228k;
            gm.l.c(intent3);
            intent3.setAction(string3);
            String string4 = obtainAttributes.getString(R.styleable.ActivityNavigator_data);
            if (string4 != null) {
                Uri parse = Uri.parse(string4);
                if (this.f16228k == null) {
                    this.f16228k = new Intent();
                }
                Intent intent4 = this.f16228k;
                gm.l.c(intent4);
                intent4.setData(parse);
            }
            this.f16229l = obtainAttributes.getString(R.styleable.ActivityNavigator_dataPattern);
            obtainAttributes.recycle();
        }

        @Override // i2.v
        public final String toString() {
            ComponentName componentName;
            Intent intent = this.f16228k;
            String str = null;
            if (intent != null) {
                componentName = intent.getComponent();
            } else {
                componentName = null;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(super.toString());
            if (componentName != null) {
                sb2.append(" class=");
                sb2.append(componentName.getClassName());
            } else {
                Intent intent2 = this.f16228k;
                if (intent2 != null) {
                    str = intent2.getAction();
                }
                if (str != null) {
                    sb2.append(" action=");
                    sb2.append(str);
                }
            }
            String sb3 = sb2.toString();
            gm.l.e(sb3, "sb.toString()");
            return sb3;
        }
    }

    /* renamed from: i2.b$b */
    /* loaded from: classes.dex */
    public static final class C0288b implements h0.a {
    }

    /* loaded from: classes.dex */
    public static final class c extends gm.m implements fm.l<Context, Context> {

        /* renamed from: b */
        public static final c f16230b = new c();

        public c() {
            super(1);
        }

        @Override // fm.l
        public final Context k(Context context) {
            Context context2 = context;
            gm.l.f(context2, "it");
            if (context2 instanceof ContextWrapper) {
                return ((ContextWrapper) context2).getBaseContext();
            }
            return null;
        }
    }

    public b(Context context) {
        Object obj;
        gm.l.f(context, "context");
        this.f16226c = context;
        Iterator it = nm.j.H(context, c.f16230b).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Context) obj) instanceof Activity) {
                break;
            }
        }
        this.f16227d = (Activity) obj;
    }

    @Override // i2.h0
    public final a a() {
        return new a(this);
    }

    @Override // i2.h0
    public final v c(a aVar, Bundle bundle, b0 b0Var, h0.a aVar2) {
        Intent intent;
        int intExtra;
        boolean z10;
        a aVar3 = aVar;
        if (aVar3.f16228k != null) {
            Intent intent2 = new Intent(aVar3.f16228k);
            int i10 = 0;
            if (bundle != null) {
                intent2.putExtras(bundle);
                String str = aVar3.f16229l;
                if (str != null && str.length() != 0) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (!z10) {
                    StringBuffer stringBuffer = new StringBuffer();
                    Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(str);
                    while (matcher.find()) {
                        String group = matcher.group(1);
                        if (bundle.containsKey(group)) {
                            matcher.appendReplacement(stringBuffer, "");
                            stringBuffer.append(Uri.encode(String.valueOf(bundle.get(group))));
                        } else {
                            throw new IllegalArgumentException("Could not find " + group + " in " + bundle + " to fill data pattern " + str);
                        }
                    }
                    matcher.appendTail(stringBuffer);
                    intent2.setData(Uri.parse(stringBuffer.toString()));
                }
            }
            boolean z11 = aVar2 instanceof C0288b;
            if (z11) {
                ((C0288b) aVar2).getClass();
                intent2.addFlags(0);
            }
            if (this.f16227d == null) {
                intent2.addFlags(268435456);
            }
            if (b0Var != null && b0Var.f16231a) {
                intent2.addFlags(536870912);
            }
            Activity activity = this.f16227d;
            if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
            }
            intent2.putExtra("android-support-navigation:ActivityNavigator:current", aVar3.f16410h);
            Resources resources = this.f16226c.getResources();
            if (b0Var != null) {
                int i11 = b0Var.f16238h;
                int i12 = b0Var.f16239i;
                if ((i11 > 0 && gm.l.a(resources.getResourceTypeName(i11), "animator")) || (i12 > 0 && gm.l.a(resources.getResourceTypeName(i12), "animator"))) {
                    StringBuilder a10 = android.support.v4.media.d.a("Activity destinations do not support Animator resource. Ignoring popEnter resource ");
                    a10.append(resources.getResourceName(i11));
                    a10.append(" and popExit resource ");
                    a10.append(resources.getResourceName(i12));
                    a10.append(" when launching ");
                    a10.append(aVar3);
                    Log.w("ActivityNavigator", a10.toString());
                } else {
                    intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", i11);
                    intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", i12);
                }
            }
            if (z11) {
                ((C0288b) aVar2).getClass();
            }
            this.f16226c.startActivity(intent2);
            if (b0Var != null && this.f16227d != null) {
                int i13 = b0Var.f16236f;
                int i14 = b0Var.f16237g;
                if ((i13 > 0 && gm.l.a(resources.getResourceTypeName(i13), "animator")) || (i14 > 0 && gm.l.a(resources.getResourceTypeName(i14), "animator"))) {
                    StringBuilder a11 = android.support.v4.media.d.a("Activity destinations do not support Animator resource. Ignoring enter resource ");
                    a11.append(resources.getResourceName(i13));
                    a11.append(" and exit resource ");
                    a11.append(resources.getResourceName(i14));
                    a11.append("when launching ");
                    a11.append(aVar3);
                    Log.w("ActivityNavigator", a11.toString());
                    return null;
                } else if (i13 >= 0 || i14 >= 0) {
                    if (i13 < 0) {
                        i13 = 0;
                    }
                    if (i14 >= 0) {
                        i10 = i14;
                    }
                    this.f16227d.overridePendingTransition(i13, i10);
                    return null;
                } else {
                    return null;
                }
            }
            return null;
        }
        throw new IllegalStateException(a0.q.b(android.support.v4.media.d.a("Destination "), aVar3.f16410h, " does not have an Intent set.").toString());
    }

    @Override // i2.h0
    public final boolean j() {
        Activity activity = this.f16227d;
        if (activity != null) {
            activity.finish();
            return true;
        }
        return false;
    }
}
