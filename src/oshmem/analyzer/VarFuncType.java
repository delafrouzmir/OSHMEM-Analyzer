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
//        switch (s) {
//            case "float":
//                return FLOAT;
//            case "double":
//                return DOUBLE;
//            case "long double":
//                return LONGDOUBLE;
//            case "char":
//                return CHAR;
//            case "signed char":
//                return SIGNEDCHAR;
//            case "short":
//                return SHORT;
//            case "int":
//                return INT;
//            case "long":
//                return LONG;
//            case "long long":
//                return LONGLONG;
//            case "unsigned char":
//                return UNSIGNEDCHAR;
//            case "unsigned short":
//                return UNSIGNEDSHORT;
//            case "unsigned int":
//                return UNSIGNEDINT;
//            case "unsigned long":
//                return UNSIGNEDLONG;
//            case "unsigned long long":
//                return UNSIGNEDLONGLONG;
//            case "int8_t":
//                return INT8_T;
//            case "int16_t":
//                return INT16_T;
//            case "int32_t":
//                return INT32_T;
//            case "int64_t":
//                return INT64_T;
//            case "unit8_t":
//                return UINT8_T;
//            case "uint16_t":
//                return UINT16_T;
//            case "uint32_t":
//                return UINT32_T;
//            case "uint64_t":
//                return UINT64_T;
//            case "size_t":
//                return SIZE_T;
//            case "ptrdiff_t":
//                return PTRDIFF_T;
//            case "void":
//                return VOID;
//            default:
//                return OTHER;
//        }
    }
}
