package xh;

import com.topstep.fitcloud.pro.model.dial.DialComponent;
import com.topstep.fitcloud.pro.model.dial.DialPushParams;
import com.topstep.fitcloud.pro.model.dial.DialSpacePacket;
import fm.p;
import java.util.ArrayList;
import java.util.List;
import no.nordicsemi.android.dfu.DfuBaseService;
import ul.q;
import xh.i;
import y3.c1;

/* loaded from: classes2.dex */
public final class n extends gm.m implements p<i.c, y3.b<? extends tl.l>, i.c> {

    /* renamed from: b */
    public final /* synthetic */ List<DialComponent> f30583b;

    /* renamed from: c */
    public final /* synthetic */ int f30584c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(int i10, List list) {
        super(2);
        this.f30583b = list;
        this.f30584c = i10;
    }

    @Override // fm.p
    public final i.c A(i.c cVar, y3.b<? extends tl.l> bVar) {
        c1 c1Var;
        DialPushParams copy;
        ArrayList arrayList;
        DialPushParams copy2;
        DialSpacePacket dialSpacePacket;
        DialSpacePacket copy3;
        i.c cVar2 = cVar;
        y3.b<? extends tl.l> bVar2 = bVar;
        gm.l.f(cVar2, "$this$execute");
        gm.l.f(bVar2, "it");
        y3.b<DialPushParams> bVar3 = cVar2.f30573a;
        if ((bVar2 instanceof c1) && (bVar3 instanceof c1)) {
            if (this.f30583b != null) {
                c1 c1Var2 = (c1) bVar3;
                List<DialSpacePacket> dialSpacePackets = ((DialPushParams) c1Var2.f30937b).getDialSpacePackets();
                if (dialSpacePackets != null) {
                    arrayList = q.Z(dialSpacePackets);
                } else {
                    arrayList = null;
                }
                ArrayList arrayList2 = arrayList;
                if (arrayList2 != null && (dialSpacePacket = (DialSpacePacket) arrayList2.remove(this.f30584c)) != null) {
                    int i10 = this.f30584c;
                    copy3 = dialSpacePacket.copy((r20 & 1) != 0 ? dialSpacePacket.dialType : (byte) 0, (r20 & 2) != 0 ? dialSpacePacket.dialNum : 0, (r20 & 4) != 0 ? dialSpacePacket.dialBinVersion : 0, (r20 & 8) != 0 ? dialSpacePacket.binFlag : (byte) 0, (r20 & 16) != 0 ? dialSpacePacket.spaceSize : 0, (r20 & 32) != 0 ? dialSpacePacket.imgUrl : null, (r20 & 64) != 0 ? dialSpacePacket.deviceImgUrl : null, (r20 & 128) != 0 ? dialSpacePacket.previewImgUrl : null, (r20 & DfuBaseService.ERROR_REMOTE_TYPE_LEGACY) != 0 ? dialSpacePacket.components : this.f30583b);
                    arrayList2.add(i10, copy3);
                }
                copy2 = r4.copy((r22 & 1) != 0 ? r4.hardwareInfo : null, (r22 & 2) != 0 ? r4.projectNum : null, (r22 & 4) != 0 ? r4.isSupportGUI : false, (r22 & 8) != 0 ? r4.isSupportCustom : false, (r22 & 16) != 0 ? r4.lcd : 0, (r22 & 32) != 0 ? r4.shape : null, (r22 & 64) != 0 ? r4.toolVersion : null, (r22 & 128) != 0 ? r4.currentDialNum : 0, (r22 & DfuBaseService.ERROR_REMOTE_TYPE_LEGACY) != 0 ? r4.currentPosition : this.f30584c, (r22 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE) != 0 ? ((DialPushParams) c1Var2.f30937b).dialSpacePackets : arrayList2);
                c1Var = new c1(copy2);
            } else {
                copy = r4.copy((r22 & 1) != 0 ? r4.hardwareInfo : null, (r22 & 2) != 0 ? r4.projectNum : null, (r22 & 4) != 0 ? r4.isSupportGUI : false, (r22 & 8) != 0 ? r4.isSupportCustom : false, (r22 & 16) != 0 ? r4.lcd : 0, (r22 & 32) != 0 ? r4.shape : null, (r22 & 64) != 0 ? r4.toolVersion : null, (r22 & 128) != 0 ? r4.currentDialNum : 0, (r22 & DfuBaseService.ERROR_REMOTE_TYPE_LEGACY) != 0 ? r4.currentPosition : this.f30584c, (r22 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE) != 0 ? ((DialPushParams) ((c1) bVar3).f30937b).dialSpacePackets : null);
                c1Var = new c1(copy);
            }
            bVar3 = c1Var;
        }
        gm.l.f(bVar3, "getParams");
        return new i.c(bVar3, bVar2);
    }
}
