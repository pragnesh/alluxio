// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/catalog_master.proto

package alluxio.grpc;

public interface TypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.Type)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>required .alluxio.grpc.FieldTypeId type = 1;</code>
   */
  boolean hasType();
  /**
   * <code>required .alluxio.grpc.FieldTypeId type = 1;</code>
   */
  alluxio.grpc.FieldTypeId getType();

  /**
   * <pre>
   * parse directly from a string
   * </pre>
   *
   * <code>optional string primitive_field = 2;</code>
   */
  boolean hasPrimitiveField();
  /**
   * <pre>
   * parse directly from a string
   * </pre>
   *
   * <code>optional string primitive_field = 2;</code>
   */
  java.lang.String getPrimitiveField();
  /**
   * <pre>
   * parse directly from a string
   * </pre>
   *
   * <code>optional string primitive_field = 2;</code>
   */
  com.google.protobuf.ByteString
      getPrimitiveFieldBytes();

  /**
   * <pre>
   *a list of fields for complex types
   * </pre>
   *
   * <code>repeated .alluxio.grpc.FieldSchema nested_fields = 3;</code>
   */
  java.util.List<alluxio.grpc.FieldSchema> 
      getNestedFieldsList();
  /**
   * <pre>
   *a list of fields for complex types
   * </pre>
   *
   * <code>repeated .alluxio.grpc.FieldSchema nested_fields = 3;</code>
   */
  alluxio.grpc.FieldSchema getNestedFields(int index);
  /**
   * <pre>
   *a list of fields for complex types
   * </pre>
   *
   * <code>repeated .alluxio.grpc.FieldSchema nested_fields = 3;</code>
   */
  int getNestedFieldsCount();
  /**
   * <pre>
   *a list of fields for complex types
   * </pre>
   *
   * <code>repeated .alluxio.grpc.FieldSchema nested_fields = 3;</code>
   */
  java.util.List<? extends alluxio.grpc.FieldSchemaOrBuilder> 
      getNestedFieldsOrBuilderList();
  /**
   * <pre>
   *a list of fields for complex types
   * </pre>
   *
   * <code>repeated .alluxio.grpc.FieldSchema nested_fields = 3;</code>
   */
  alluxio.grpc.FieldSchemaOrBuilder getNestedFieldsOrBuilder(
      int index);
}
