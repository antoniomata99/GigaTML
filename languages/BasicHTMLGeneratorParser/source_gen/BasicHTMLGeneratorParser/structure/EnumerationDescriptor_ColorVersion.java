package BasicHTMLGeneratorParser.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.EnumerationDescriptorBase;
import jetbrains.mps.smodel.runtime.EnumerationDescriptor;
import jetbrains.mps.lang.smodel.EnumerationLiteralsIndex;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;

public class EnumerationDescriptor_ColorVersion extends EnumerationDescriptorBase {

  public EnumerationDescriptor_ColorVersion() {
    super(0xc5b04c8306054412L, 0x977887c884988a45L, 0x2c77447521800c96L, "ColorVersion", "r:b0473809-af0c-4a38-9b87-8a1cd23e0d1d(BasicHTMLGeneratorParser.structure)/3204104929761299606");
  }

  private final EnumerationDescriptor.MemberDescriptor myMember_primary_0 = new EnumerationDescriptor.MemberDescriptor("primary", "is-primary", 0x2c77447521800c97L, "r:b0473809-af0c-4a38-9b87-8a1cd23e0d1d(BasicHTMLGeneratorParser.structure)/3204104929761299607");
  private final EnumerationDescriptor.MemberDescriptor myMember_link_0 = new EnumerationDescriptor.MemberDescriptor("link", "is-link", 0x40ef7d13bc2a2d85L, "r:b0473809-af0c-4a38-9b87-8a1cd23e0d1d(BasicHTMLGeneratorParser.structure)/4679096061575966085");

  private final EnumerationLiteralsIndex myIndex = EnumerationLiteralsIndex.build(0xc5b04c8306054412L, 0x977887c884988a45L, 0x2c77447521800c96L, 0x2c77447521800c97L, 0x40ef7d13bc2a2d85L);
  private final List<EnumerationDescriptor.MemberDescriptor> myMembers = new EnumerationDescriptorBase.MembersList(myIndex, myMember_primary_0, myMember_link_0);

  @Nullable
  @Override
  public EnumerationDescriptor.MemberDescriptor getDefault() {
    return null;
  }

  @NotNull
  @Override
  public List<EnumerationDescriptor.MemberDescriptor> getMembers() {
    return myMembers;
  }

  @Nullable
  @Override
  public EnumerationDescriptor.MemberDescriptor getMember(@Nullable String memberName) {
    if (memberName == null) {
      return null;
    }
    switch (memberName) {
      case "primary":
        return myMember_primary_0;
      case "link":
        return myMember_link_0;
    }
    return null;
  }

  @Nullable
  @Override
  public EnumerationDescriptor.MemberDescriptor getMember(long idValue) {
    int index = myIndex.index(idValue);
    if (index == -1) {
      return null;
    }
    return myMembers.get(index);
  }
}
