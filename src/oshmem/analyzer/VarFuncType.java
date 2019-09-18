/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oshmem.analyzer;

/**
 *
 * @author Delafrouz
 */

public enum VarFuncType {
    FLOAT("float"),
    DOUBLE("double"),
    LONGDOUBLE("long double"),
    CHAR("char"),
    SIGNEDCHAR("signed char"),
    SHORT("short"),
    INT("int"),
    LONG("long"),
    LONGLONG("long long"),
    UNSIGNEDCHAR("unsigned char"),
    UNSIGNEDSHORT("unsigned short"),
    UNSIGNEDINT("unsigned int"),
    UNSIGNEDLONG("unsigned long"),
    UNSIGNEDLONGLONG("unsigned long long"),
    INT8_T("int8_t"),
    INT16_T("int16_t"),
    INT32_T("int32_t"),
    INT64_T("int64_t"),
    UINT8_T("unit8_t"),
    UINT16_T("uint16_t"),
    UINT32_T("uint32_t"),
    UINT64_T("uint64_t"),
    SIZE_T("size_t"),
    PTRDIFF_T("ptrdiff_t"),
    VOID("void");

    String key;

    VarFuncType(String key) {
        this.key = key;
    }

    String getValue() {
        return this.key;
    }
}
