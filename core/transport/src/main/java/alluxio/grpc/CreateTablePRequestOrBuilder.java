// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/catalog_master.proto

package alluxio.grpc;

public interface CreateTablePRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.CreateTablePRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string db_name = 1;</code>
   */
  boolean hasDbName();
  /**
   * <code>optional string db_name = 1;</code>
   */
  java.lang.String getDbName();
  /**
   * <code>optional string db_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getDbNameBytes();

  /**
   * <code>optional string table_name = 2;</code>
   */
  boolean hasTableName();
  /**
   * <code>optional string table_name = 2;</code>
   */
  java.lang.String getTableName();
  /**
   * <code>optional string table_name = 2;</code>
   */
  com.google.protobuf.ByteString
      getTableNameBytes();

  /**
   * <code>optional .alluxio.grpc.Schema schema = 3;</code>
   */
  boolean hasSchema();
  /**
   * <code>optional .alluxio.grpc.Schema schema = 3;</code>
   */
  alluxio.grpc.Schema getSchema();
  /**
   * <code>optional .alluxio.grpc.Schema schema = 3;</code>
   */
  alluxio.grpc.SchemaOrBuilder getSchemaOrBuilder();
}
