// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/catalog_master.proto

package alluxio.grpc;

public interface GetStatisticsPResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.GetStatisticsPResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>map&lt;string, .alluxio.grpc.FileStatistics&gt; statistics = 1;</code>
   */
  int getStatisticsCount();
  /**
   * <code>map&lt;string, .alluxio.grpc.FileStatistics&gt; statistics = 1;</code>
   */
  boolean containsStatistics(
      java.lang.String key);
  /**
   * Use {@link #getStatisticsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, alluxio.grpc.FileStatistics>
  getStatistics();
  /**
   * <code>map&lt;string, .alluxio.grpc.FileStatistics&gt; statistics = 1;</code>
   */
  java.util.Map<java.lang.String, alluxio.grpc.FileStatistics>
  getStatisticsMap();
  /**
   * <code>map&lt;string, .alluxio.grpc.FileStatistics&gt; statistics = 1;</code>
   */

  alluxio.grpc.FileStatistics getStatisticsOrDefault(
      java.lang.String key,
      alluxio.grpc.FileStatistics defaultValue);
  /**
   * <code>map&lt;string, .alluxio.grpc.FileStatistics&gt; statistics = 1;</code>
   */

  alluxio.grpc.FileStatistics getStatisticsOrThrow(
      java.lang.String key);
}
