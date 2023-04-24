package ph;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import com.polidea.rxandroidble3.internal.RxBleLog;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final /* synthetic */ class q implements wk.d {

    /* renamed from: a */
    public final /* synthetic */ int f24209a;

    /* renamed from: b */
    public final /* synthetic */ Object f24210b;

    public /* synthetic */ q(int i10, Object obj) {
        this.f24209a = i10;
        this.f24210b = obj;
    }

    @Override // wk.d
    public final void accept(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        switch (this.f24209a) {
            case 0:
                fm.l lVar = (fm.l) this.f24210b;
                gm.l.f(lVar, "$tmp0");
                lVar.k(obj);
                return;
            case 1:
                fm.l lVar2 = (fm.l) this.f24210b;
                gm.l.f(lVar2, "$tmp0");
                lVar2.k(obj);
                return;
            case 2:
                fm.l lVar3 = (fm.l) this.f24210b;
                AtomicInteger atomicInteger = wi.k.E;
                gm.l.f(lVar3, "$tmp0");
                lVar3.k(obj);
                return;
            case 3:
                fm.l lVar4 = (fm.l) this.f24210b;
                gm.l.f(lVar4, "$tmp0");
                lVar4.k(obj);
                return;
            case 4:
                fm.l lVar5 = (fm.l) this.f24210b;
                gm.l.f(lVar5, "$tmp0");
                lVar5.k(obj);
                return;
            case 5:
                fm.l lVar6 = (fm.l) this.f24210b;
                gm.l.f(lVar6, "$tmp0");
                lVar6.k(obj);
                return;
            case 6:
                fm.l lVar7 = (fm.l) this.f24210b;
                int i10 = bk.d.f4422g;
                gm.l.f(lVar7, "$tmp0");
                lVar7.k(obj);
                return;
            default:
                qc.l0 l0Var = (qc.l0) this.f24210b;
                kc.y0 y0Var = (kc.y0) obj;
                pc.c cVar = l0Var.f24743f;
                BluetoothDevice device = l0Var.f24742e.getDevice();
                cVar.getClass();
                if (RxBleLog.isAtLeast(2)) {
                    RxBleLog.v("Preparing services description", new Object[0]);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("--------------- ====== Printing peripheral content ====== ---------------\n");
                    sb2.append(pc.b.c(device.getAddress()));
                    sb2.append('\n');
                    sb2.append("PERIPHERAL NAME: ");
                    sb2.append(device.getName());
                    sb2.append('\n');
                    sb2.append("-------------------------------------------------------------------------");
                    for (BluetoothGattService bluetoothGattService : y0Var.f18434a) {
                        sb2.append('\n');
                        sb2.append("\n");
                        if (bluetoothGattService.getType() == 0) {
                            str = "Primary Service";
                        } else {
                            str = "Secondary Service";
                        }
                        sb2.append(str);
                        sb2.append(" - ");
                        String a10 = vc.b.a(bluetoothGattService.getUuid());
                        if (a10 != null) {
                            str2 = vc.b.f29195a.get(a10);
                        } else {
                            str2 = null;
                        }
                        if (str2 == null) {
                            str2 = "Unknown service";
                        }
                        sb2.append(str2);
                        sb2.append(" (");
                        sb2.append(pc.b.d(bluetoothGattService.getUuid()));
                        sb2.append(")\n");
                        sb2.append("Instance ID: ");
                        sb2.append(bluetoothGattService.getInstanceId());
                        sb2.append('\n');
                        sb2.append("-> Characteristics:");
                        for (BluetoothGattCharacteristic bluetoothGattCharacteristic : bluetoothGattService.getCharacteristics()) {
                            sb2.append('\n');
                            sb2.append('\t');
                            sb2.append("* ");
                            String a11 = vc.b.a(bluetoothGattCharacteristic.getUuid());
                            if (a11 != null) {
                                str3 = vc.b.f29196b.get(a11);
                            } else {
                                str3 = null;
                            }
                            if (str3 == null) {
                                str3 = "Unknown characteristic";
                            }
                            sb2.append(str3);
                            sb2.append(" (");
                            sb2.append(pc.b.d(bluetoothGattCharacteristic.getUuid()));
                            sb2.append(")");
                            sb2.append('\n');
                            sb2.append('\t');
                            sb2.append("  ");
                            sb2.append("Properties: ");
                            sb2.append(cVar.f24011a.a(bluetoothGattCharacteristic.getProperties()));
                            if (!bluetoothGattCharacteristic.getDescriptors().isEmpty()) {
                                sb2.append('\n');
                                sb2.append('\t');
                                sb2.append("  ");
                                sb2.append("-> Descriptors: ");
                                for (BluetoothGattDescriptor bluetoothGattDescriptor : bluetoothGattCharacteristic.getDescriptors()) {
                                    sb2.append('\n');
                                    sb2.append('\t');
                                    sb2.append('\t');
                                    sb2.append("* ");
                                    String a12 = vc.b.a(bluetoothGattDescriptor.getUuid());
                                    if (a12 != null) {
                                        str4 = vc.b.f29197c.get(a12);
                                    } else {
                                        str4 = null;
                                    }
                                    if (str4 == null) {
                                        str4 = "Unknown descriptor";
                                    }
                                    sb2.append(str4);
                                    sb2.append(" (");
                                    sb2.append(pc.b.d(bluetoothGattDescriptor.getUuid()));
                                    sb2.append(")");
                                }
                            }
                        }
                    }
                    sb2.append("\n--------------- ====== Finished peripheral content ====== ---------------");
                    RxBleLog.v(sb2.toString(), new Object[0]);
                    return;
                }
                return;
        }
    }
}
