/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula.meta;


import com.facebook.thrift.IntRangeSet;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({ "unused" })
public enum AdminCmd implements com.facebook.thrift.TEnum {
  COMPACT(0),
  FLUSH(1),
  REBUILD_TAG_INDEX(2),
  REBUILD_EDGE_INDEX(3),
  STATS(4),
  DATA_BALANCE(5),
  DOWNLOAD(6),
  INGEST(7),
  UNKNOWN(99);

  private final int value;

  private AdminCmd(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static AdminCmd findByValue(int value) { 
    switch (value) {
      case 0:
        return COMPACT;
      case 1:
        return FLUSH;
      case 2:
        return REBUILD_TAG_INDEX;
      case 3:
        return REBUILD_EDGE_INDEX;
      case 4:
        return STATS;
      case 5:
        return DATA_BALANCE;
      case 6:
        return DOWNLOAD;
      case 7:
        return INGEST;
      case 99:
        return UNKNOWN;
      default:
        return null;
    }
  }
}
