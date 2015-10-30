/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bugvm.apple.foundation;

/*<imports>*/
import java.util.*;
import com.bugvm.objc.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("Foundation")/*</annotations>*/
@Marshaler(/*<name>*/NSFileSystemAttributes/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSFileSystemAttributes/*</name>*/ 
    extends /*<extends>*/NSDictionaryWrapper/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static NSFileSystemAttributes toObject(Class<NSFileSystemAttributes> cls, long handle, long flags) {
            NSDictionary o = (NSDictionary) NSObject.Marshaler.toObject(NSDictionary.class, handle, flags);
            if (o == null) {
                return null;
            }
            return new NSFileSystemAttributes(o);
        }
        @MarshalsPointer
        public static long toNative(NSFileSystemAttributes o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.data, flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<NSFileSystemAttributes> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSDictionary> o = (NSArray<NSDictionary>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<NSFileSystemAttributes> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(new NSFileSystemAttributes(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<NSFileSystemAttributes> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSDictionary> array = new NSMutableArray<>();
            for (NSFileSystemAttributes i : l) {
                array.add(i.getDictionary());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constructors>*/
    NSFileSystemAttributes(NSDictionary data) {
        super(data);
    }
    public NSFileSystemAttributes() {}
    /*</constructors>*/

    /*<methods>*/
    public boolean has(NSFileSystemAttribute key) {
        return data.containsKey(key.value());
    }
    public NSObject get(NSFileSystemAttribute key) {
        if (has(key)) {
            return data.get(key.value());
        }
        return null;
    }
    public NSFileSystemAttributes set(NSFileSystemAttribute key, NSObject value) {
        data.put(key.value(), value);
        return this;
    }
    

    public long getSystemNumber() {
        if (has(NSFileSystemAttribute.Number)) {
            NSNumber val = (NSNumber) get(NSFileSystemAttribute.Number);
            return val.longValue();
        }
        return 0;
    }
    public NSFileSystemAttributes setSystemNumber(long systemNumber) {
        set(NSFileSystemAttribute.Number, NSNumber.valueOf(systemNumber));
        return this;
    }
    public long getSize() {
        if (has(NSFileSystemAttribute.Size)) {
            NSNumber val = (NSNumber) get(NSFileSystemAttribute.Size);
            return val.longValue();
        }
        return 0;
    }
    public NSFileSystemAttributes setSize(long size) {
        set(NSFileSystemAttribute.Size, NSNumber.valueOf(size));
        return this;
    }
    public long getFreeSize() {
        if (has(NSFileSystemAttribute.FreeSize)) {
            NSNumber val = (NSNumber) get(NSFileSystemAttribute.FreeSize);
            return val.longValue();
        }
        return 0;
    }
    public NSFileSystemAttributes setFreeSize(long freeSize) {
        set(NSFileSystemAttribute.FreeSize, NSNumber.valueOf(freeSize));
        return this;
    }
    public long getNodes() {
        if (has(NSFileSystemAttribute.Nodes)) {
            NSNumber val = (NSNumber) get(NSFileSystemAttribute.Nodes);
            return val.longValue();
        }
        return 0;
    }
    public NSFileSystemAttributes setNodes(long nodes) {
        set(NSFileSystemAttribute.Nodes, NSNumber.valueOf(nodes));
        return this;
    }
    public long getFreeNodes() {
        if (has(NSFileSystemAttribute.FreeNodes)) {
            NSNumber val = (NSNumber) get(NSFileSystemAttribute.FreeNodes);
            return val.longValue();
        }
        return 0;
    }
    public NSFileSystemAttributes setFreeNodes(long freeNodes) {
        set(NSFileSystemAttribute.FreeNodes, NSNumber.valueOf(freeNodes));
        return this;
    }
    /*</methods>*/
    
    /*<keys>*/
    /*</keys>*/
}