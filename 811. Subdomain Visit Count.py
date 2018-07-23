class Solution(object):
    def subdomainVisits(self, cpdomains):
        """
        :type cpdomains: List[str]
        :rtype: List[str]
        """
        h = {}
        for domain in cpdomains:
            count, domain_act = domain.split(" ")
            sub_domains = domain_act.split(".")
            for i in range( len( sub_domains ) ):
                key = ""
                for j in range( i, len(sub_domains ) ):
                    if j != len( sub_domains ) - 1: 
                        key += sub_domains[j] + "."
                    else:
                        key += sub_domains[j]
                if key in h.keys():
                    h[ key ] += int( count )
                else:
                    h[ key ] = int( count )
        return [ str( item[1] ) + " " + str( item[0] ) for item in h.items() ]