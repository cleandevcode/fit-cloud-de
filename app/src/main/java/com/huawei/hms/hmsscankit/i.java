package com.huawei.hms.hmsscankit;

import android.app.Activity;
import android.view.View;
import com.huawei.hms.hmsscankit.RemoteView;

/* loaded from: classes.dex */
public class i implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ RemoteView.a f7088a;

    public i(RemoteView.a aVar) {
        this.f7088a = aVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Activity activity;
        RemoteView.a aVar = this.f7088a;
        RemoteView remoteView = RemoteView.this;
        activity = aVar.f7063g;
        remoteView.startPhotoCode(activity);
    }
}
