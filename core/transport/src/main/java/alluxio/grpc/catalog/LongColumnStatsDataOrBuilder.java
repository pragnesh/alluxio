// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/catalog/catalog_master.proto

package alluxio.grpc.catalog;

public interface LongColumnStatsDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.catalog.LongColumnStatsData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int64 lowValue = 1;</code>
   */
  boolean hasLowValue();
  /**
   * <code>optional int64 lowValue = 1;</code>
   */
  long getLowValue();

  /**
   * <code>optional int64 highValue = 2;</code>
   */
  boolean hasHighValue();
  /**
   * <code>optional int64 highValue = 2;</code>
   */
  long getHighValue();

  /**
   * <code>optional int64 numNulls = 3;</code>
   */
  boolean hasNumNulls();
  /**
   * <code>optional int64 numNulls = 3;</code>
   */
  long getNumNulls();

  /**
   * <code>optional int64 numDVs = 4;</code>
   */
  boolean hasNumDVs();
  /**
   * <code>optional int64 numDVs = 4;</code>
   */
  long getNumDVs();

  /**
   * <code>optional string bitVectors = 5;</code>
   */
  boolean hasBitVectors();
  /**
   * <code>optional string bitVectors = 5;</code>
   */
  java.lang.String getBitVectors();
  /**
   * <code>optional string bitVectors = 5;</code>
   */
  com.google.protobuf.ByteString
      getBitVectorsBytes();
}