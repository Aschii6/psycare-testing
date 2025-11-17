<#-- CENTER -->
<#function gap>
    <#if orientation == 'portrait'>
        <#return '630px'>
    <#else>
        <#return '300px'>
    </#if>
</#function>

<table style="width:100%; height:${gap()}">
    <tr><td style="border:0">
            <h1 style="text-align:center; font-size:96px; margin-bottom: 50px">
                ${frontpage.title}
            </h1>
        </td>
    </tr>

    <tr><td style="border:0; text-align:center">
        <div style="margin:0 auto;">
            <p style="margin:0; font-size:48px;">
                ${frontpage.description}
            </p>
        </div>
    </td></tr>
</table>