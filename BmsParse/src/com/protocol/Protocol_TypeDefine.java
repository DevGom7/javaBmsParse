// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TypeDefine.proto

package com.protocol;

public final class Protocol_TypeDefine {
  private Protocol_TypeDefine() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface TypeDefineOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TypeDefine)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 abc = 1;</code>
     */
    boolean hasAbc();
    /**
     * <code>optional int32 abc = 1;</code>
     */
    int getAbc();
  }
  /**
   * Protobuf type {@code TypeDefine}
   */
  public static final class TypeDefine extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:TypeDefine)
      TypeDefineOrBuilder {
    // Use TypeDefine.newBuilder() to construct.
    private TypeDefine(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private TypeDefine(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final TypeDefine defaultInstance;
    public static TypeDefine getDefaultInstance() {
      return defaultInstance;
    }

    public TypeDefine getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private TypeDefine(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              abc_ = input.readInt32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.protocol.Protocol_TypeDefine.internal_static_TypeDefine_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.protocol.Protocol_TypeDefine.internal_static_TypeDefine_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.protocol.Protocol_TypeDefine.TypeDefine.class, com.protocol.Protocol_TypeDefine.TypeDefine.Builder.class);
    }

    public static com.google.protobuf.Parser<TypeDefine> PARSER =
        new com.google.protobuf.AbstractParser<TypeDefine>() {
      public TypeDefine parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TypeDefine(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<TypeDefine> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int ABC_FIELD_NUMBER = 1;
    private int abc_;
    /**
     * <code>optional int32 abc = 1;</code>
     */
    public boolean hasAbc() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 abc = 1;</code>
     */
    public int getAbc() {
      return abc_;
    }

    private void initFields() {
      abc_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, abc_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, abc_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.protocol.Protocol_TypeDefine.TypeDefine parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.protocol.Protocol_TypeDefine.TypeDefine parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.protocol.Protocol_TypeDefine.TypeDefine parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.protocol.Protocol_TypeDefine.TypeDefine parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.protocol.Protocol_TypeDefine.TypeDefine parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.protocol.Protocol_TypeDefine.TypeDefine parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.protocol.Protocol_TypeDefine.TypeDefine parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.protocol.Protocol_TypeDefine.TypeDefine parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.protocol.Protocol_TypeDefine.TypeDefine parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.protocol.Protocol_TypeDefine.TypeDefine parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.protocol.Protocol_TypeDefine.TypeDefine prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code TypeDefine}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TypeDefine)
        com.protocol.Protocol_TypeDefine.TypeDefineOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.protocol.Protocol_TypeDefine.internal_static_TypeDefine_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.protocol.Protocol_TypeDefine.internal_static_TypeDefine_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.protocol.Protocol_TypeDefine.TypeDefine.class, com.protocol.Protocol_TypeDefine.TypeDefine.Builder.class);
      }

      // Construct using com.protocol.Protocol_TypeDefine.TypeDefine.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        abc_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.protocol.Protocol_TypeDefine.internal_static_TypeDefine_descriptor;
      }

      public com.protocol.Protocol_TypeDefine.TypeDefine getDefaultInstanceForType() {
        return com.protocol.Protocol_TypeDefine.TypeDefine.getDefaultInstance();
      }

      public com.protocol.Protocol_TypeDefine.TypeDefine build() {
        com.protocol.Protocol_TypeDefine.TypeDefine result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.protocol.Protocol_TypeDefine.TypeDefine buildPartial() {
        com.protocol.Protocol_TypeDefine.TypeDefine result = new com.protocol.Protocol_TypeDefine.TypeDefine(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.abc_ = abc_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.protocol.Protocol_TypeDefine.TypeDefine) {
          return mergeFrom((com.protocol.Protocol_TypeDefine.TypeDefine)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.protocol.Protocol_TypeDefine.TypeDefine other) {
        if (other == com.protocol.Protocol_TypeDefine.TypeDefine.getDefaultInstance()) return this;
        if (other.hasAbc()) {
          setAbc(other.getAbc());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.protocol.Protocol_TypeDefine.TypeDefine parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.protocol.Protocol_TypeDefine.TypeDefine) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int abc_ ;
      /**
       * <code>optional int32 abc = 1;</code>
       */
      public boolean hasAbc() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 abc = 1;</code>
       */
      public int getAbc() {
        return abc_;
      }
      /**
       * <code>optional int32 abc = 1;</code>
       */
      public Builder setAbc(int value) {
        bitField0_ |= 0x00000001;
        abc_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 abc = 1;</code>
       */
      public Builder clearAbc() {
        bitField0_ = (bitField0_ & ~0x00000001);
        abc_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:TypeDefine)
    }

    static {
      defaultInstance = new TypeDefine(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:TypeDefine)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TypeDefine_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_TypeDefine_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020TypeDefine.proto\"\031\n\nTypeDefine\022\013\n\003abc\030" +
      "\001 \001(\005B#\n\014com.protocolB\023Protocol_TypeDefi" +
      "ne"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_TypeDefine_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TypeDefine_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_TypeDefine_descriptor,
        new java.lang.String[] { "Abc", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
