package cn.sharesdk.framework.authorize;

import android.content.Context;
import android.content.Intent;
import com.mob.MobSDK;
import com.mob.tools.FakeActivity;

/* loaded from: classes.dex */
public class AbstractAuthorizeActivity extends FakeActivity {
    public AuthorizeHelper helper;

    public AuthorizeHelper getHelper() {
        return this.helper;
    }

    @Override // com.mob.tools.FakeActivity
    public void show(Context context, Intent intent) {
        throw new RuntimeException("This method is deprecated, use show(AuthorizeHelper, Intent) instead");
    }

    public void show(AuthorizeHelper authorizeHelper) {
        this.helper = authorizeHelper;
        super.show(MobSDK.getContext(), null);
    }
}
