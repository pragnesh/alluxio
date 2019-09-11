// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/catalog_master.proto

package alluxio.grpc;

public interface FileMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.FileMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .alluxio.grpc.MessageType schema = 1;</code>
   */
  boolean hasSchema();
  /**
   * <code>optional .alluxio.grpc.MessageType schema = 1;</code>
   */
  alluxio.grpc.MessageType getSchema();
  /**
   * <code>optional .alluxio.grpc.MessageType schema = 1;</code>
   */
  alluxio.grpc.MessageTypeOrBuilder getSchemaOrBuilder();

  /**
   * <code>map&lt;string, string&gt; key_value_metadata = 2;</code>
   */
  int getKeyValueMetadataCount();
  /**
   * <code>map&lt;string, string&gt; key_value_metadata = 2;</code>
   */
  boolean containsKeyValueMetadata(
      java.lang.String key);
  /**
   * Use {@link #getKeyValueMetadataMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getKeyValueMetadata();
  /**
   * <code>map&lt;string, string&gt; key_value_metadata = 2;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getKeyValueMetadataMap();
  /**
   * <code>map&lt;string, string&gt; key_value_metadata = 2;</code>
   */

  java.lang.String getKeyValueMetadataOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; key_value_metadata = 2;</code>
   */

  java.lang.String getKeyValueMetadataOrThrow(
      java.lang.String key);

  /**
   * <code>optional string created_by = 3;</code>
   */
  boolean hasCreatedBy();
  /**
   * <code>optional string created_by = 3;</code>
   */
  java.lang.String getCreatedBy();
  /**
   * <code>optional string created_by = 3;</code>
   */
  com.google.protobuf.ByteString
      getCreatedByBytes();
}