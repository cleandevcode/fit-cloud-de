package cn.sharesdk.framework;

import cn.sharesdk.framework.utils.SSDKLog;
import com.mob.MobSDK;
import com.mob.OperationCallback;
import com.mob.RHolder;
import com.mob.commons.SHARESDK;
import com.mob.commons.dialog.entity.InternalPolicyUi;
import com.mob.tools.utils.ResHelper;

/* loaded from: classes.dex */
public class ProvicyCanContinue {

    /* renamed from: a */
    private static volatile ProvicyCanContinue f5061a;

    /* loaded from: classes.dex */
    public interface OnBusinessListener {
        void onContinue();

        void onError(Throwable th2);

        void onStop();
    }

    private ProvicyCanContinue() {
        b();
    }

    public static ProvicyCanContinue a() {
        synchronized (ProvicyCanContinue.class) {
            if (f5061a == null) {
                synchronized (ProvicyCanContinue.class) {
                    if (f5061a == null) {
                        f5061a = new ProvicyCanContinue();
                    }
                }
            }
        }
        return f5061a;
    }

    private void b() {
        RHolder.getInstance().setActivityThemeId(ResHelper.getStyleRes(MobSDK.getContext(), "mobcommon_TranslucentTheme")).setDialogThemeId(ResHelper.getStyleRes(MobSDK.getContext(), "mobcommon_DialogStyle")).setDialogLayoutId(ResHelper.getLayoutRes(MobSDK.getContext(), "mob_authorize_dialog"));
        SSDKLog.b().a("ShareSDK", "ProvicyCanContinue initMobCommonView()");
    }

    public void a(final OnBusinessListener onBusinessListener) {
        MobSDK.canIContinueBusiness(new SHARESDK(), new InternalPolicyUi.Builder().setTitleText(MobSDK.getContext().getResources().getString(ResHelper.getStringRes(MobSDK.getContext(), "mobcommon_authorize_dialog_title"))).setContentText(MobSDK.getContext().getResources().getString(ResHelper.getStringRes(MobSDK.getContext(), "mobcommon_authorize_dialog_content"))).build(), new OperationCallback<Boolean>() { // from class: cn.sharesdk.framework.ProvicyCanContinue.1
            @Override // com.mob.OperationCallback
            public void onComplete(Boolean bool) {
                SSDKLog b10 = SSDKLog.b();
                b10.a("ShareSDK", "canIContinueBusiness: onComplete(), " + bool);
                if (bool.booleanValue()) {
                    OnBusinessListener onBusinessListener2 = onBusinessListener;
                    if (onBusinessListener2 != null) {
                        onBusinessListener2.onContinue();
                    }
                    SSDKLog.b().a("ShareSDK", "MobSDK.canIContinueBusiness if ");
                    return;
                }
                OnBusinessListener onBusinessListener3 = onBusinessListener;
                if (onBusinessListener3 != null) {
                    onBusinessListener3.onStop();
                }
                SSDKLog.b().a("ShareSDK", "MobSDK.canIContinueBusiness else ");
            }

            @Override // com.mob.OperationCallback
            public void onFailure(Throwable th2) {
                SSDKLog.b().a("ShareSDK", cn.sharesdk.facebook.e.a("canIContinueBusiness: onFailure() ", th2));
                OnBusinessListener onBusinessListener2 = onBusinessListener;
                if (onBusinessListener2 != null) {
                    onBusinessListener2.onError(th2);
                }
            }
        });
    }
}
