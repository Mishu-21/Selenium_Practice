package CSS_Selector_Locator;

public class DifferentWaysToWrite_CSS_1 {
	public static void main(String[] args) {
		/*
		 * (chatGpt) and some from sir ke notes se 
		 There are different ways to writre CSS
		 
		 search -->how to write css selector locator in different form in tabular form
		 
		                   Selector Type                        Syntax                                     Example                                                            Description

                               Tag Selector                      tagname                                       div                                                               Selects all elements with that tag.
                               Class Selector                    .classname                                    .btn-primary                                                      Selects elements with that class.
                               ID Selector                       #id                                           #login-button                                                     Selects the element with that ID.
                               Attribute Selector                [attr], [attr="value"]                        input[type="text"]                                                Selects elements with specific attributes.
                               Starts With Attribute             [attr], [attr="value"]                        a[href^="https"]                                                  Selects attributes starting with value.
                               Ends With Attribute               [attr$="value"]                               img[src$=".png"]                                                  Selects attributes ending with value.
                               Contains Attribute                [attr*="value"]                               div[class*="container"]                                           Selects attributes containing value.
                               Descendant Selector               ancestor descendant                           div p                                                             Selects <p> inside any <div>.
                               Child Selector                    parent > child                                ul> li                                                            Selects direct child elements only.
                               Adjacent Sibling                  element + next                                h1 + p                                                            Selects the next sibling immediately after.
                               General Sibling                   element ~ siblings                            h1 ~ p                                                            Selects all siblings after the element.
                               Group Selector                    selector1, selector2                          h1 , h2 , h3                                                      Applies styles to multiple elements.
                               Pseudo-Class                      element:pseudo-class                          a:hover, li:first-child                                           Selects based on state or position.
                               Pseudo-Element                    element::pseudo-element                       p::first-line, p::before                                          Targets part of an element.
                               Complex Selector                  Combination of multiple selectors             div#main > ul.list > li.active a[href^="https"]                   Targets very specific elements.
                               Tag and the Id                    tagName#id_value                              input#ap_email                                                    Selects element with that tagname and the Id
		                       Tag and the class                 tagName.className_value                       textarea.gLFyf                                                    Selects element with that tagname and the className                   
		                       Attribute name and Value          [AN='AV']                                     [name='q']                                                        Selects element with that  attribute name and the value.
		                       Tag,Class,AN,AV                   tagName.className_value[AN='AV']              textarea.gLFyf[name='q'] 
		                       With Substring                    tagName[AN^='Partial_AV']                     input[id^='twosearch']                                             
		 */
	}

}
