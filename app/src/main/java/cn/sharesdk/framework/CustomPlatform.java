package cn.sharesdk.framework;

import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.a.b.f;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class CustomPlatform extends Platform {
    @Override // cn.sharesdk.framework.Platform
    public abstract boolean checkAuthorize(int i10, Object obj);

    @Override // cn.sharesdk.framework.Platform
    public void doAuthorize(String[] strArr) {
    }

    @Override // cn.sharesdk.framework.Platform
    public void doCustomerProtocol(String str, String str2, int i10, HashMap<String, Object> hashMap, HashMap<String, String> hashMap2) {
    }

    @Override // cn.sharesdk.framework.Platform
    public void doShare(Platform.ShareParams shareParams) {
    }

    @Override // cn.sharesdk.framework.Platform
    public HashMap<String, Object> filterFriendshipInfo(int i10, HashMap<String, Object> hashMap) {
        return null;
    }

    @Override // cn.sharesdk.framework.Platform
    public final f.a filterShareContent(Platform.ShareParams shareParams, HashMap<String, Object> hashMap) {
        return null;
    }

    @Override // cn.sharesdk.framework.Platform
    public void follow(String str) {
    }

    @Override // cn.sharesdk.framework.Platform
    public HashMap<String, Object> getBilaterals(int i10, int i11, String str) {
        return null;
    }

    public int getCustomPlatformId() {
        return 1;
    }

    @Override // cn.sharesdk.framework.Platform
    public HashMap<String, Object> getFollowers(int i10, int i11, String str) {
        return null;
    }

    @Override // cn.sharesdk.framework.Platform
    public HashMap<String, Object> getFollowings(int i10, int i11, String str) {
        return null;
    }

    @Override // cn.sharesdk.framework.Platform
    public void getFriendList(int i10, int i11, String str) {
    }

    @Override // cn.sharesdk.framework.Platform
    public abstract String getName();

    @Override // cn.sharesdk.framework.Platform
    public final int getPlatformId() {
        return -Math.abs(getCustomPlatformId());
    }

    @Override // cn.sharesdk.framework.Platform
    public int getVersion() {
        return 0;
    }

    @Override // cn.sharesdk.framework.Platform
    public boolean hasShareCallback() {
        return false;
    }

    @Override // cn.sharesdk.framework.Platform
    public final void initDevInfo(String str) {
    }

    @Override // cn.sharesdk.framework.Platform
    public final void setNetworkDevinfo() {
    }

    @Override // cn.sharesdk.framework.Platform
    public void timeline(int i10, int i11, String str) {
    }

    @Override // cn.sharesdk.framework.Platform
    public void userInfor(String str) {
    }
}
